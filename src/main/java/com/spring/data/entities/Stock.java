package com.spring.data.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stock extends Investment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long stockId;

	private BigDecimal sharePrice;

	public Long getStockId() {
		return stockId;
	}

	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}


	public BigDecimal getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(BigDecimal sharePrice) {
		this.sharePrice = sharePrice;
	}

	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", name=" + name + ", issuer=" + issuer + ", purchaseDate=" + purchaseDate
				+ ", sharePrice=" + sharePrice + "]";
	}



}
