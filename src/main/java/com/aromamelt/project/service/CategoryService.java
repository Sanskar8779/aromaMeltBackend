package com.aromamelt.project.service;

import com.aromamelt.project.model.Category;
import com.aromamelt.project.payload.CategoryDTO;
import com.aromamelt.project.payload.CategoryResponse;


public interface CategoryService {
    CategoryResponse getAllCategories();
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    CategoryDTO deleteCategory(Long categoryId);
    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
