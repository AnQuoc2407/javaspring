package com.bezkoder.spring.jpa.h2.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bezkoder.spring.jpa.h2.model.Tutorial;
import com.bezkoder.spring.jpa.h2.repository.TutorialRepository;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private TutorialRepository tutorialRepository;

    @Override
    public void run(String... args) throws Exception {
        // Insert initial data into the database
//        tutorialRepository.save(new Tutorial("Sample Tutorial 1", "Description 1", true));
//        tutorialRepository.save(new Tutorial("Sample Tutorial 2", "Description 2", false));
//        tutorialRepository.save(new Tutorial("Sample Tutorial 3", "Description 3", true));
    }
}