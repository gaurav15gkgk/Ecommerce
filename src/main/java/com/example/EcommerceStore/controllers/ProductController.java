package com.example.EcommerceStore.controllers;

import com.example.EcommerceStore.dto.AddProductDTO;
import com.example.EcommerceStore.dto.FakeStoreProductRequestDTO;
import com.example.EcommerceStore.dto.ProductDTO;
import com.example.EcommerceStore.gateway.IProductGateway;
import com.example.EcommerceStore.services.IProductService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("api/products")
public class ProductController {

    private final IProductService productService;

    public ProductController(IProductService productService){
        this.productService = productService;
    }

    @GetMapping("/{productId}")
    public ProductDTO getSingleProduct(@PathVariable("productId") Integer productId) throws IOException{
        return this.productService.getSingleProduct(productId);
    }

    @PostMapping
    public AddProductDTO addProduct(@RequestBody FakeStoreProductRequestDTO product) throws IOException{
        return this.productService.addProduct(product);
    }


}
