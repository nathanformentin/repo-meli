package com.meli.linktracker.controllers;
import com.meli.linktracker.dtos.LinkDTO;
import com.meli.linktracker.service.LinkService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@ControllerAdvice
public class LinkController {

    final LinkService linkService;

    public LinkController(LinkService linkService) {
        this.linkService = linkService;
    }


    @PostMapping("link/generate")
    public ResponseEntity<String> createLink() {
        try {
            return new ResponseEntity<>(linkService.create(), HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/link/{linkId}")
    public ResponseEntity<LinkDTO> unmaskLink(@PathVariable String linkId) {
        try {
            return new ResponseEntity<>(linkService.accessLink(linkId), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }

    @GetMapping("/link/getinfo/{unmaskedID}")
    public LinkDTO getInfo(@PathVariable int unmaskedID) {
        return linkService.search(unmaskedID);
    }

    @DeleteMapping("link/delete/{maskedID}")
    public ResponseEntity<HttpStatus> delete(@PathVariable String maskedID) {
        try {
            linkService.deleteAccount(maskedID);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch(Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }




}
