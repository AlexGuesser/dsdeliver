package com.guesseralex.dsdeliver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guesseralex.dsdeliver.dto.OrderDTO;
import com.guesseralex.dsdeliver.dto.ProductDTO;
import com.guesseralex.dsdeliver.service.OrderService;
import com.guesseralex.dsdeliver.service.ProductService;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
   
   @Autowired
   private OrderService service;
   
   @GetMapping
   public ResponseEntity<List<OrderDTO>> findAll(){
      List<OrderDTO> list = service.findAll();
      return ResponseEntity.ok().body(list);
   }

}
