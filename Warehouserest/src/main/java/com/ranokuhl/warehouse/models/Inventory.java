package com.ranokuhl.warehouse.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.morphia.annotations.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import dev.morphia.annotations.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@Document(collection = "Inventory")
@Entity(noClassnameStored = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Inventory {

    @Id
    private String id;
    @JsonProperty("inventory")
    private List<Stock> stock;

    public Inventory() {}
}
