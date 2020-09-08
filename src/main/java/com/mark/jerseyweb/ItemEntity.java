package com.mark.jerseyweb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Double price;

    public Integer getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    private String name;

}
