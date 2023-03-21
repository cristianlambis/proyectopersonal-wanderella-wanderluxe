package com.clambis.wanderella.controller;

import com.clambis.wanderella.model.Destination;
import com.clambis.wanderella.service.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DestinationController {
    @Autowired
    private DestinationService destinationService;

    @GetMapping("/destinations")
    public List<Destination> getDestinations(@RequestParam String location, @RequestParam List<String> preferences) {
        return destinationService.findDestinationsByLocationAndPreferences(location, preferences);
    }
}
