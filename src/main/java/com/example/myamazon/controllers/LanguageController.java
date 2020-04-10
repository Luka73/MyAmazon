package com.example.myamazon.controllers;

import com.example.myamazon.models.Language;
import com.example.myamazon.repositories.LanguageRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {

    private final LanguageRepository languageRepository;

    public LanguageController(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @PostMapping("/language")
    Language post(@RequestBody Language language) {
        return languageRepository.save(language);
    }
}
