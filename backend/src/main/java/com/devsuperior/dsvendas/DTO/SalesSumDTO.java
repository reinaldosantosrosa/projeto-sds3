package com.devsuperior.dsvendas.DTO;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SalesSumDTO implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String SellerName ;
    private Double Sum;
    
	public SalesSumDTO(Seller seller, Double sum) {

		SellerName = seller.getName();
		Sum = sum;
	}
    
	public SalesSumDTO() {}

	public String getSellerName() {
		return SellerName;
	}

	public void setSellerName(String sellerName) {
		SellerName = sellerName;
	}

	public Double getSum() {
		return Sum;
	}

	public void setSum(Double sum) {
		Sum = sum;
	}
	
	
    
}
