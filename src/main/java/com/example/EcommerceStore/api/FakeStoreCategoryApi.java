package com.example.EcommerceStore.api;

import com.example.EcommerceStore.dto.FakeStoryCategoryResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;

public interface FakeStoreCategoryApi {

    @GET("products/category")
   Call<FakeStoryCategoryResponseDTO> getAllFakeCategories() throws IOException;
}
