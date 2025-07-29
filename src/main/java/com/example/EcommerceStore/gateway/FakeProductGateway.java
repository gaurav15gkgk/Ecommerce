package com.example.EcommerceStore.gateway;

import java.io.IOException;

import org.springframework.stereotype.Component;

import com.example.EcommerceStore.api.FakeStoreProductApi;
import com.example.EcommerceStore.dto.AddProductDTO;
import com.example.EcommerceStore.dto.FakeStoreAddProductResponseDTO;
import com.example.EcommerceStore.dto.FakeStoreProductRequestDTO;
import com.example.EcommerceStore.dto.FakeStoreProductResponseDTO;
import com.example.EcommerceStore.dto.ProductDTO;

@Component
public class FakeProductGateway implements IProductGateway {
    private final FakeStoreProductApi fakeStoreProductApi;

    public FakeProductGateway(FakeStoreProductApi fakeStoreProductApi){
        this.fakeStoreProductApi = fakeStoreProductApi;
    }


    @Override
    public ProductDTO getSingleProduct(Integer productId) throws IOException {
        FakeStoreProductResponseDTO responseDTO = this.fakeStoreProductApi.getProduct(productId).execute().body();

        if(responseDTO == null) throw new IOException("Unable to fetch the product");

        return responseDTO.getProduct();
    }

    @Override
    public AddProductDTO addProduct(FakeStoreProductRequestDTO product) throws IOException{
        System.out.println("Adding product: " + product);
        FakeStoreAddProductResponseDTO responseDTO = this.fakeStoreProductApi.addProduct(product).execute().body();

        if(responseDTO == null) throw new IOException("Unable to add the product");

        return responseDTO.getProduct();
    }
}
