package com.spring.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.data.entities.Market;

public interface MarketRepository extends JpaRepository<Market, Long> {

}
