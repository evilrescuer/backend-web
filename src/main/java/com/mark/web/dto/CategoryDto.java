package com.mark.web.dto;

import com.mark.web.entity.ItemEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CategoryDto {
    private Integer id;
    private String name;
    private List<ItemEntity> items;
}
