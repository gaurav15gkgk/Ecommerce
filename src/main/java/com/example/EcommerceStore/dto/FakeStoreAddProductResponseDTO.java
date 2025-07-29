package com.example.EcommerceStore.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FakeStoreAddProductResponseDTO {
    private String status;
    private String message;
    private AddProductDTO product;
}
