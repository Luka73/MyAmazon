package com.example.myamazon.controllers;

import com.example.myamazon.models.Publisher;
import com.example.myamazon.repositories.PublisherRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublisherController {

    private final PublisherRepository publisherRepository;


    public PublisherController(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @PostMapping("/publisher")
    Publisher post(@RequestBody Publisher publisher) {
        return publisherRepository.save(publisher);
    }
}
