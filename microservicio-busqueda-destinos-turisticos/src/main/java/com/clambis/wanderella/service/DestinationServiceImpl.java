package com.clambis.wanderella.service;

import com.clambis.wanderella.model.Destination;
import com.clambis.wanderella.repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DestinationServiceImpl implements DestinationService{
    @Autowired
    private DestinationRepository destinationRepository;

    @Override
    public List<Destination> findDestinationsByLocationAndPreferences(String location, List<String> preferences) {
        return destinationRepository.findByLocationAndCategoriesIn(location, preferences);
    }
}
