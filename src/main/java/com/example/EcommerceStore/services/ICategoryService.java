package com.example.EcommerceStore.services;

import com.example.EcommerceStore.dto.CategoryDTO;
import com.example.EcommerceStore.dto.ProductDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {
    List<CategoryDTO> getAlLCategories() throws IOException;

}
