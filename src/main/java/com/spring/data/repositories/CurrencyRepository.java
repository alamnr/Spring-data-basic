package com.spring.data.repositories;

import org.springframework.data.repository.CrudRepository;

import com.spring.data.entities.Currency;
import com.spring.data.entities.id.CurrencyId;

public interface  CurrencyRepository extends CrudRepository<Currency, CurrencyId> {

}
