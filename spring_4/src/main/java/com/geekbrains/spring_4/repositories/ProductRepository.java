package com.geekbrains.spring_4.repositories;

import com.geekbrains.spring_4.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findAllByOrderByCostAsc();
    List<Product> findAllByOrderByCostDesc();
}
