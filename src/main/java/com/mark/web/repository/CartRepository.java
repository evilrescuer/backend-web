package com.mark.web.repository;

import com.mark.web.entity.CartEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zhimao.lin
 */
@Repository
public interface CartRepository extends CrudRepository<CartEntity, Integer> {}
