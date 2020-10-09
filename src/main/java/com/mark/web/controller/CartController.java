package com.mark.web.controller;

import com.mark.web.entity.CartEntity;
import com.mark.web.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
    @Autowired
    private CartRepository cartRepository;
    @GetMapping("/cart/{id}")
    public CartEntity findById(@PathVariable Integer id) {
        return cartRepository.findById(id).get();
    }
}
