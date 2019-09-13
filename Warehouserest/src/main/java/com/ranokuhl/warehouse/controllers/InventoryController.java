package com.ranokuhl.warehouse.controllers;

import com.ranokuhl.warehouse.models.Inventory;
import com.ranokuhl.warehouse.repositories.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/api/v1")
public class InventoryController {

        @Autowired
        private InventoryRepository inventoryRepository;


        // Methods for articles
        @RequestMapping(value = "/inventory", method = RequestMethod.GET)
        public List<Inventory> getAllInventory() {
                return inventoryRepository.findAll();
        }
}

