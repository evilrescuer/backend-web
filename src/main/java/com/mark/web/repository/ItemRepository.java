package com.mark.web.repository;

import com.mark.web.entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zhimao.lin
 */
@Repository
public interface ItemRepository extends CrudRepository<ItemEntity, Integer> {
}
