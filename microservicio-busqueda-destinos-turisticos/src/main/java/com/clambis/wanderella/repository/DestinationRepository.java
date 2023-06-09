package com.clambis.wanderella.repository;

import com.clambis.wanderella.model.Destination;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DestinationRepository {
    List<Destination> findByLocationAndCategoriesIn(String location, List<String> categories);

}
