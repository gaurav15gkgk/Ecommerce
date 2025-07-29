package com.example.EcommerceStore.services;

import com.example.EcommerceStore.dto.CategoryDTO;
import com.example.EcommerceStore.dto.ProductDTO;
import com.example.EcommerceStore.gateway.ICategoryGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreCategoryService implements ICategoryService{

    private final ICategoryGateway categoryGateway;

    public FakeStoreCategoryService(ICategoryGateway categoryGateway){
        this.categoryGateway = categoryGateway;
    }

    @Override
    public List<CategoryDTO> getAlLCategories() throws IOException {
        return this.categoryGateway.getAllCategories();
    }
}
