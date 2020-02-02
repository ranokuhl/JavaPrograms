package com.ranokuhl.warehouse.controllers;

import com.ranokuhl.warehouse.models.Inventory;
import com.ranokuhl.warehouse.repositories.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;

@RestController
@RequestMapping(value = "/api/v1")
public class InventoryController {

    private final InventoryRepository inventoryRepository;

    @Autowired
    public InventoryController(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @GetMapping("/inventory/all")
    public Collection<Inventory> findAllInventory() {
        return inventoryRepository.findAll();
    }



}
