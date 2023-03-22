package com.clambis.wanderella.service;
import com.clambis.wanderella.model.TouristDestination;

import java.util.List;

public interface DestinationService {
    List<TouristDestination> searchDestinations(String location, String preferences);
}
