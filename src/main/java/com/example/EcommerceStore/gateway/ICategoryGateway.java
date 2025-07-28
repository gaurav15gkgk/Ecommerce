package com.example.EcommerceStore.gateway;

import com.example.EcommerceStore.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryGateway {
    List<CategoryDTO> getAllCategories() throws IOException;
}
