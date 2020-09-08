package com.mark.jerseyweb;

import org.springframework.beans.BeanUtils;
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
    public void update(@RequestBody ItemEntity itemEntity, @PathVariable Integer id) {
        itemEntity.setId(id);
        itemRepository.save(itemEntity);
    }

    @PostMapping("/items")
    public void update(@RequestBody ItemEntity itemEntity) {
        itemRepository.save(itemEntity);
    }

    @DeleteMapping("/items/{id}")
    public void update(@PathVariable Integer id) {
        itemRepository.deleteById(id);
    }
}
