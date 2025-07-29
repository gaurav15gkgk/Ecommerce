package com.example.EcommerceStore.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Integer id;
    private String title;
    private String image;
    private Integer price;
    private String description;
    private String brand;
    private String model;
    private String color;
    private String category;
    private Boolean popular;
    private Float discount;
}
