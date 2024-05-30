package org.example.Service.Impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.Dto.Category;
import org.example.Entity.CategoryEntity;
import org.example.Repository.CategoryRepository;
import org.example.Service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    final CategoryRepository repository;
    final ModelMapper mapper;

    @Override
    public void addCategory(Category category) {

        repository.save(mapper.map(category, CategoryEntity.class));
        log.info(category.toString());
    }

    @Override
    public List<CategoryEntity> getAllCategory() {
        return repository.findAll();
    }

    @Override
    public boolean deleteCategory(Long id) {
        if (repository.existsById(id)){

            repository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }
}
