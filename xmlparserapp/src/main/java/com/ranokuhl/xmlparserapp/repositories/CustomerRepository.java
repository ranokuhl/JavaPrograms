package com.ranokuhl.xmlparserapp.repositories;


import com.ranokuhl.xmlparserapp.models.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

}
