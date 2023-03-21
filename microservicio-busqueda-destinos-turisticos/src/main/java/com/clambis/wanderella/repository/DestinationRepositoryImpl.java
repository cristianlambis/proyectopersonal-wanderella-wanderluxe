package com.clambis.wanderella.repository;

import com.clambis.wanderella.model.Destination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class DestinationRepositoryImpl implements DestinationRepository{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Destination> findByLocationAndCategoriesIn(String location, List<String> categories) {
        Query query = new Query();
        query.addCriteria(Criteria.where("location").is(location).and("category").in(categories));
        List<Destination> destinations = mongoTemplate.find(query, Destination.class);
        return destinations;
    }

}
