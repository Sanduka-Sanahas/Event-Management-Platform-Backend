package org.example.Service;

import org.example.Dto.Category;
import org.example.Entity.CategoryEntity;

import java.util.List;

public interface CategoryService {

    void addCategory(Category category);
    List<CategoryEntity> getAllCategory();
    boolean deleteCategory(Long id);
}
