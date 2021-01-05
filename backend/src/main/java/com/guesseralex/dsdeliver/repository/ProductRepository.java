package com.guesseralex.dsdeliver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guesseralex.dsdeliver.entity.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{
   
   List<Product> findAllByOrderByNameAsc();

}
