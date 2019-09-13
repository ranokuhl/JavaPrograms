package com.ranokuhl.warehouse.repositories;

import com.ranokuhl.warehouse.models.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRepository extends MongoRepository<Inventory, String> {
}
