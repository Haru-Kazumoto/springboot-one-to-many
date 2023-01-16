package com.project.onetomany.dto;

import lombok.*;

@Data
@NoArgsConstructor
@ToString
public class OrderResponse {
    private String name;
    private String productName;

    public OrderResponse(String name, String productName) {
        this.name = name;
        this.productName = productName;
    }
}
