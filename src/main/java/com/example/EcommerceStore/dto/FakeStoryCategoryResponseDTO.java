package com.example.EcommerceStore.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FakeStoryCategoryResponseDTO {
    private String status;
    private String message;
    private List<String> categories;
}
