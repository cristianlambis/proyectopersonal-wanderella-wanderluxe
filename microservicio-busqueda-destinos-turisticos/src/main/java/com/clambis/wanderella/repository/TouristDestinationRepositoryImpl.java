package com.clambis.wanderella.repository;

import com.clambis.wanderella.model.TouristDestination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TouristDestinationRepositoryImpl implements TouristDestinationRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<TouristDestination> findByLocationAndPreferencesIn(String location, List<String> preferences) {
        Query query = new Query();
        query.addCriteria(Criteria.where("location").is(location).and("preferences").in(preferences));
        List<TouristDestination> destinations = mongoTemplate.find(query, TouristDestination.class);
        return destinations;
    }
}