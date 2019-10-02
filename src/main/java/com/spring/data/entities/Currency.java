package com.spring.data.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.spring.data.entities.id.CurrencyId;

@Entity
@IdClass(CurrencyId.class)
public class Currency {

	@Id
	private String currencyName;

	@Id
	private String countryName;

	private String symbol;



	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}


}
