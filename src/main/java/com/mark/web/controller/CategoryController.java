package com.mark.web.controller;

import com.mark.web.entity.CategoryEntity;
import com.mark.web.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author zhimao.lin
 */
@Controller
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/categories/{id}")
    public CategoryEntity findById(@PathVariable Integer id) {
        System.out.println(categoryRepository.findById(id));
        return categoryRepository.findById(id).get();
    }

    @PutMapping("/categories/{id}")
    public CategoryEntity update(@RequestBody CategoryEntity categoryEntity, @PathVariable Integer id) {
        categoryEntity.setId(id);
        return categoryRepository.save(categoryEntity);
    }

    @PostMapping("/categories/{id}")
    public CategoryEntity update(@RequestBody CategoryEntity categoryEntity) {
        return categoryRepository.save(categoryEntity);
    }

    @DeleteMapping("/categories/{id}")
    public void remove(@PathVariable Integer id) {
        categoryRepository.deleteById(id);
    }
}
