package com.guesseralex.dsdeliver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guesseralex.dsdeliver.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
