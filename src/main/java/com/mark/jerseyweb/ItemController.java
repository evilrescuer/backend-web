package com.mark.jerseyweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

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
}
