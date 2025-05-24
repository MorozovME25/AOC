package com.example.demo.controller;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @GetMapping
    public List<Category> getAllCategories() {
        return List.of(new Category(1, "Test Category"));
    }
}
