package com.example.EcommerceStore.services;

import com.example.EcommerceStore.dto.AddProductDTO;
import com.example.EcommerceStore.dto.FakeStoreProductRequestDTO;
import com.example.EcommerceStore.dto.ProductDTO;
import com.example.EcommerceStore.gateway.IProductGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class FakeStoreProductService implements IProductService {

    private final IProductGateway productGateway;

    public FakeStoreProductService(IProductGateway productGateway){
        this.productGateway = productGateway;
    }

    @Override
    public ProductDTO getSingleProduct(Integer productId) throws IOException {
        return this.productGateway.getSingleProduct(productId);
    }

    @Override
    public AddProductDTO addProduct(FakeStoreProductRequestDTO product) throws IOException{
        return this.productGateway.addProduct(product);
    }
}
