package com.clambis.wanderella.service;

import com.clambis.wanderella.model.Destination;

import java.util.List;

public interface DestinationService {
    List<Destination> findDestinationsByLocationAndPreferences(String location, List<String> preferences);
}
