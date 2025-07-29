package com.example.EcommerceStore.api;

import java.io.IOException;

import com.example.EcommerceStore.dto.FakeStoreAddProductResponseDTO;
import com.example.EcommerceStore.dto.FakeStoreProductRequestDTO;
import com.example.EcommerceStore.dto.FakeStoreProductResponseDTO;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface FakeStoreProductApi {

    @GET("products/{productId}")
    Call<FakeStoreProductResponseDTO> getProduct(@Path("productId") Integer productId) throws IOException;

    @POST("products")
    Call<FakeStoreAddProductResponseDTO> addProduct(@Body FakeStoreProductRequestDTO product) throws IOException;

}
