package org.example.Controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.Dto.Category;
import org.example.Entity.CategoryEntity;
import org.example.Service.CategoryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/event")
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
public class CategoryController {

    final CategoryService service;

    @PostMapping("add-category")
    public void addCategory(@RequestBody Category category){
        log.info(category.toString());
        service.addCategory(category);
    }

    @GetMapping("/get-all-category")
    public Iterable<CategoryEntity> getAll(){

        return service.getAllCategory();
    }
}
