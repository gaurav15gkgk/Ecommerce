package com.example.EcommerceStore.services;

import com.example.EcommerceStore.dto.AddProductDTO;
import com.example.EcommerceStore.dto.FakeStoreProductRequestDTO;
import com.example.EcommerceStore.dto.ProductDTO;

import java.io.IOException;

public interface IProductService {
    ProductDTO getSingleProduct(Integer productId) throws IOException;

    AddProductDTO addProduct(FakeStoreProductRequestDTO product) throws IOException;

}
