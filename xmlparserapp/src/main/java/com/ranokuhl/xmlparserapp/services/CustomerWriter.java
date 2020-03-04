package com.ranokuhl.xmlparserapp.services;

import com.ranokuhl.xmlparserapp.models.Customer;
import com.ranokuhl.xmlparserapp.repositories.CustomerRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class CustomerWriter implements ItemWriter<Customer> {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void write(List<? extends Customer> customers) throws Exception {
        customerRepository.saveAll(customers);
    }

}