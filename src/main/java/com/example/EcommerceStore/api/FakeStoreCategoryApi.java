package com.example.EcommerceStore.api;

import com.example.EcommerceStore.dto.FakeStoreProductResponseDTO;
import com.example.EcommerceStore.dto.FakeStoryCategoryResponseDTO;
import com.example.EcommerceStore.dto.ProductDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.io.IOException;

public interface FakeStoreCategoryApi {

    @GET("products/category")
   Call<FakeStoryCategoryResponseDTO> getAllFakeCategories() throws IOException;



}
