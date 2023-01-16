package com.project.onetomany.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    private int productId;
    private String productName;
    private int quantity;
    private int productPrice;
}
