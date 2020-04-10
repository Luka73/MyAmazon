package com.example.myamazon.controllers;

import com.example.myamazon.models.Contributor;
import com.example.myamazon.repositories.ContributorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ContributorController {

    private final ContributorRepository contributorRepository;

    ContributorController(ContributorRepository contributorRepository) {
        this.contributorRepository = contributorRepository;
    }

    @PostMapping("/contributor")
    Contributor post(@RequestBody Contributor contributor) {
        return contributorRepository.save(contributor);
    }

    @GetMapping("/contributor/{id}")
    Contributor getOne(@PathVariable Long id) {
        Optional<Contributor> contributor = contributorRepository.findById(id);
        return contributor.isPresent() ? contributor.get() : null;
    }

    @GetMapping("/contributors")
    List<Contributor> getAll() {
        return contributorRepository.findAll();
    }
}
