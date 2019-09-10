package com.ranokuhl.warehouse.repositories;

import com.ranokuhl.warehouse.models.Articles;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticlesRepository extends MongoRepository<Articles, String>{

}