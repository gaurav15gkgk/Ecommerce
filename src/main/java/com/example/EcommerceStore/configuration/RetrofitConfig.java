package com.example.EcommerceStore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.EcommerceStore.api.FakeStoreCategoryApi;
import com.example.EcommerceStore.api.FakeStoreProductApi;

import io.github.cdimascio.dotenv.Dotenv;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {

    @Bean
    public Retrofit retrofit(){
        return new Retrofit.Builder()
                .baseUrl(Dotenv.load().get("BASE_URI"))
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public FakeStoreCategoryApi fakeStoreCategoryApi(Retrofit retrofit){
        return retrofit.create(FakeStoreCategoryApi.class);
    }

    @Bean
    public FakeStoreProductApi fakeStoreProductApi(Retrofit retrofit){
        return retrofit.create(FakeStoreProductApi.class);
    }

}
