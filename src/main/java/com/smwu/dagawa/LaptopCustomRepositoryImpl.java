package com.smwu.dagawa;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

@RequiredArgsConstructor
public class LaptopCustomRepositoryImpl implements LaptopCustomRepository {
    private final MongoTemplate mongoTemplate;

    @Override
    public List<Laptop> findAllByBrand(String brand) {
        Query query = new Query();
        query.addCriteria(Criteria.where("brand").is(brand));
        query.with(Sort.by(Sort.Direction.DESC, "laptop_id"));
        return mongoTemplate.find(query, Laptop.class);
    }

    @Override
    public List<Laptop> findByKeyword(String keyword) {
        return null;
    }

    @Override
    public Laptop findById(long id) {
        return null;
    }
}
