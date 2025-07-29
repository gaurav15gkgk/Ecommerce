package com.example.EcommerceStore.gateway;

import com.example.EcommerceStore.dto.AddProductDTO;
import com.example.EcommerceStore.dto.FakeStoreProductRequestDTO;
import com.example.EcommerceStore.dto.ProductDTO;

import java.io.IOException;

public interface IProductGateway {
    ProductDTO getSingleProduct(Integer productId) throws IOException;
    AddProductDTO addProduct(FakeStoreProductRequestDTO product) throws IOException;
}
