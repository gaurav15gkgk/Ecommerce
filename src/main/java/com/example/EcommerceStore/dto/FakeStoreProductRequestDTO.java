package com.example.EcommerceStore.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FakeStoreProductRequestDTO {
    private String title;
    private String brand;
    private String model;
    private String color;
    private String category;
    private String discount;
}
