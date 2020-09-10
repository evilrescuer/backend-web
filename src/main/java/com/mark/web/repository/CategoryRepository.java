package com.mark.web.repository;

import com.mark.web.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zhimao.lin
 */
@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity, Integer> {
}
