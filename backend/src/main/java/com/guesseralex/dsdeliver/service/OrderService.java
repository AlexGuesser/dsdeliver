package com.guesseralex.dsdeliver.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.guesseralex.dsdeliver.dto.OrderDTO;
import com.guesseralex.dsdeliver.entity.Order;
import com.guesseralex.dsdeliver.repository.OrderRepository;

@Service
public class OrderService {

   @Autowired
   private OrderRepository repository;

   @Transactional(readOnly = true)
   public List<OrderDTO> findAll() {
      List<Order> list = repository.findOrdersWithProducts();
      return list.stream().map(order -> new OrderDTO(order)).collect(Collectors.toList());
   }

}
