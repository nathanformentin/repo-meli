package com.meli.linktracker.service;

import com.meli.linktracker.daos.LinkDAO;
import com.meli.linktracker.dtos.LinkDTO;
import com.meli.linktracker.models.Link;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.UUID;

@Service
public class LinkService {

    final LinkDAO linkDAO;

    public LinkService(LinkDAO linkDAO) {
        this.linkDAO = linkDAO;
    }

    public int search(String id) {
        return linkDAO.searchByMaskedID(id);
    }

    public LinkDTO search(int id) {
        return new LinkDTO(linkDAO.searchByUnmaskedID(id));
    }

    public String create() {
        Link link = generateLink();
        linkDAO.persiste(link);
        return link.getMaskedID();
    }

    public Link generateLink() {
        String id = generateID();
        return new Link(id);
    }
    public String generateID() {
        return UUID.randomUUID().toString();
    }

    public String generateUri(int id) {
        return "http://localhost:8080/link/getinfo/" + id;
    }

    public String decode(String linkId) {
        int unmaskedID = search(linkId);
        return generateUri(unmaskedID);
    }

    public LinkDTO redirect(String uri) {
        RestTemplate restTemplate = new RestTemplate();
        LinkDTO dto = restTemplate.getForObject(uri, LinkDTO.class);
        System.out.println("passou do restTemplate");
        return dto;
    }

    public LinkDTO accessLink(String linkId) {
        String uri = decode(linkId);
        return redirect(uri);
    }

    public void deleteAccount(String id) {
        int unmaskedID = linkDAO.getRealIDByMaskedID(id);
        linkDAO.deleteLink(unmaskedID);
    }
}
