package com.spring.data.entities.id;

import java.io.Serializable;

public class CurrencyId implements Serializable{

	private String currencyName;

	private String countryName;

	public CurrencyId() {

	}

	public CurrencyId(String currencyName, String countryName) {
		super();
		this.currencyName = currencyName;
		this.countryName = countryName;
	}

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



}
