package com.example.demo.data;

import org.springframework.data.repository.CrudRepository;

public interface IProductRepository extends CrudRepository<Product , String> {
}
