package com.mark.web.controller;

import com.mark.web.entity.ItemEntity;
import com.mark.web.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @Autowired
    ItemRepository itemRepository;

    @GetMapping("/")
    public String hello() {
        return String.format("Hello");
    }

    @GetMapping("/items/{id}")
    public ItemEntity getById(@PathVariable Integer id) {
        return itemRepository.findById(id).get();
    }

    @PutMapping("/items/{id}")
    public ItemEntity update(@RequestBody ItemEntity itemEntity, @PathVariable Integer id) {
        itemEntity.setId(id);
        return itemRepository.save(itemEntity);
    }

    @PostMapping("/items")
    public ItemEntity update(@RequestBody ItemEntity itemEntity) {
        return itemRepository.save(itemEntity);
    }

    @DeleteMapping("/items/{id}")
    public void remove(@PathVariable Integer id) {
        itemRepository.deleteById(id);
    }
}
