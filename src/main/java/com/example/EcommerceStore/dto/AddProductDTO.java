package com.example.EcommerceStore.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddProductDTO {
    private Integer id;
    private String title;
    private String brand;
    private String model;
    private String color;
    private String category;
    private String discount;
}
