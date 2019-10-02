package com.spring.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.data.entities.Currency;
import com.spring.data.entities.id.CurrencyId;

public interface  CurrencyRepository extends JpaRepository<Currency, CurrencyId> {

}
