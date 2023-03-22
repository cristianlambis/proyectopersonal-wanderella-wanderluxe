package com.clambis.wanderella.service;

import com.clambis.wanderella.model.TouristDestination;
import com.clambis.wanderella.repository.TouristDestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TouristDestinationService implements DestinationService {
    @Autowired
    private TouristDestinationRepository touristDestinationRepository;

    public List<TouristDestination> searchDestinations(String location, String preferences) {
        List<TouristDestination> destinations = touristDestinationRepository.findByLocationAndPreferences(location, Collections.singletonList(preferences));
        return destinations;
    }
    }

