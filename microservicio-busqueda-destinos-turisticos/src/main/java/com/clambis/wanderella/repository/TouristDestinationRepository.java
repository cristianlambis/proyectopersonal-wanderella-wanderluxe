package com.clambis.wanderella.repository;

import com.clambis.wanderella.model.TouristDestination;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TouristDestinationRepository extends MongoRepository<TouristDestination, String> {
        List<TouristDestination> findByLocationAndPreferences(String location, List<String> preferences);
}

