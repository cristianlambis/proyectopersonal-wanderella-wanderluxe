package com.clambis.wanderella.controller;

import com.clambis.wanderella.model.TouristDestination;
import com.clambis.wanderella.service.TouristDestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/destinations")
public class TouristDestinationController {
    @Autowired
    private TouristDestinationService touristDestinationService;

    @GetMapping("/search")
    public ResponseEntity<List<TouristDestination>> searchDestinations(
            @RequestParam("location") String location,
            @RequestParam("preferences") String preferences) {

        List<TouristDestination> destinations = touristDestinationService.searchDestinations(location, preferences);

        return new ResponseEntity<>(destinations, HttpStatus.OK);
    }
}
