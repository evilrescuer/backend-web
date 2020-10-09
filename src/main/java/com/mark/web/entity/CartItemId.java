package com.mark.web.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CartItemId implements Serializable {
    @Id
    @Column(name = "cart_id")
    private Integer cartId;
    @Id
    @Column(name = "item_id")
    private Integer itemId;
}
