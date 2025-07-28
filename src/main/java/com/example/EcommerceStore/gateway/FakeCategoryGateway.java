package com.example.EcommerceStore.gateway;


import com.example.EcommerceStore.api.FakeStoreCategoryApi;
import com.example.EcommerceStore.dto.CategoryDTO;
import com.example.EcommerceStore.dto.FakeStoryCategoryResponseDTO;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeCategoryGateway implements ICategoryGateway{

    private final FakeStoreCategoryApi fakeStoreCategoryApi;

    public FakeCategoryGateway(FakeStoreCategoryApi fakeStoreCategoryApi){
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        FakeStoryCategoryResponseDTO responseDTO = this.fakeStoreCategoryApi.getAllFakeCategories().execute().body();
        if(responseDTO == null) throw new IOException("Failed to fetch categories from FakeStore API");

        return responseDTO.getCategories().stream()
                        .map(category -> CategoryDTO.builder()
                        .name(category)
                        .build())
                        .toList();
    }
}
