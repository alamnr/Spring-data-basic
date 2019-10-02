package com.spring.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.data.entities.Bond;

public interface BondRepository extends JpaRepository<Bond, Long> {

}
