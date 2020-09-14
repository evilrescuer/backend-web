package com.mark.web.controller;

import com.mark.web.entity.CategoryEntity;
import com.mark.web.repository.CategoryRepository;
import com.mark.web.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author zhimao.lin
 */
@RestController
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/categories/{id}")
    public CategoryEntity findById(@PathVariable Integer id) {
        return categoryRepository.findById(id).get();
    }

    @PutMapping("/categories/{id}")
    public CategoryEntity update(@RequestBody CategoryEntity categoryEntity, @PathVariable Integer id) {
        categoryEntity.setId(id);
        categoryEntity.getItems().forEach(itemEntity -> {
            itemRepository.save(itemEntity);
        });
        return categoryRepository.save(categoryEntity);
    }

    @PostMapping("/categories")
    public CategoryEntity update(@RequestBody CategoryEntity categoryEntity) {
        CategoryEntity newCategory = new CategoryEntity();
        newCategory.setName(categoryEntity.getName());
        CategoryEntity generatedCategory = categoryRepository.save(newCategory);
        categoryEntity.getItems().stream().forEach(itemEntity -> {
            itemEntity.setCategoryId(generatedCategory.getId());
            itemRepository.save(itemEntity);
        });
        return generatedCategory;

//        return categoryRepository.save(categoryEntity);
    }

    @DeleteMapping("/categories/{id}")
    public void remove(@PathVariable Integer id) {
        categoryRepository.deleteById(id);
    }
}
