package com.guesseralex.dsdeliver.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.guesseralex.dsdeliver.dto.ProductDTO;
import com.guesseralex.dsdeliver.entity.Product;
import com.guesseralex.dsdeliver.repository.ProductRepository;

@Service
public class ProductService {

   @Autowired
   private ProductRepository repository;

   @Transactional(readOnly = true)
   public List<ProductDTO> findAll() {
      List<Product> list = repository.findAllByOrderByNameAsc();
      return list.stream().map(product -> new ProductDTO(product)).collect(Collectors.toList());
   }

}
