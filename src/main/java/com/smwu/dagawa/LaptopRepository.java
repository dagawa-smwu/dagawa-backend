package com.smwu.dagawa;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends MongoRepository<Laptop, Long>, LaptopCustomRepository {

}

