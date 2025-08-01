package com.example.EcommerceStore.controllers;

import com.example.EcommerceStore.dto.CategoryDTO;
import com.example.EcommerceStore.services.ICategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/category")
public class CategoryController {

   private final ICategoryService categoryService;

   public CategoryController(ICategoryService categoryService){
       this.categoryService = categoryService;
   }

   @GetMapping
    public List<CategoryDTO> getAllCategories() throws IOException{
       return this.categoryService.getAlLCategories();
   }

}
