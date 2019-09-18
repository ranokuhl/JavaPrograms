package com.ranokuhl.mongostore.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Setter
@Getter
public class DeliveryInfo {

    private LocalDate deliveryDate;
    private int deliveryFee;
    private boolean inStock;
}
