package com.meli.linktracker.daos;

import com.meli.linktracker.models.Link;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Data
@Service
public class LinkDAO {

    List<Link> links = new ArrayList<>();

    public void persiste(Link link) {
        links.add(link);
    }
    public void deleteLink(int id) {
        links.remove(id);
    }

    public int getRealIDByMaskedID(String id) {
        for (int i = 0; i < links.size(); i++) {
            Link currentLink = links.get(i);
            if (currentLink.getMaskedID().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public int searchByMaskedID(String id) {
        int unmaskedID = getRealIDByMaskedID(id);
        if (unmaskedID == -1) {
            throw new RuntimeException("O id nao existe.");
        }
        return unmaskedID;
    }

    public Link searchByUnmaskedID(int id) {
            Link link = links.get(id);
            link.setNumberOfClicks(link.getNumberOfClicks() + 1);
            return link;
        }


}
