package com.spring.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.data.entities.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {

}
