package com.ranokuhl.warehouse.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Parts {

    @Id
    @JsonProperty("art_id")
    private String articleId;
    @JsonProperty("amount_of")
    private String parts;

    public Parts() { }

    @Override
    public String toString() {
        return "Parts{" +
                "articleId='" + articleId + '\'' +
                ", parts='" + parts + '\'' +
                '}';
    }
}
