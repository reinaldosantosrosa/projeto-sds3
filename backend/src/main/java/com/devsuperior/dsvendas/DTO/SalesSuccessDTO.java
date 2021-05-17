package com.devsuperior.dsvendas.DTO;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SalesSuccessDTO implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String SellerName ;
    private Long Visited;
    private Long Deals;
    

    
	public SalesSuccessDTO(Seller seller, Long visited, Long deals) {

		SellerName = seller.getName();
		Visited = visited;
		Deals = deals;
	}
	

	public SalesSuccessDTO() {}

	public String getSellerName() {
		return SellerName;
	}

	public void setSellerName(String sellerName) {
		SellerName = sellerName;
	}


	public Long getVisited() {
		return Visited;
	}


	public void setVisited(Long visited) {
		Visited = visited;
	}


	public Long getDeals() {
		return Deals;
	}


	public void setDeals(Long deals) {
		Deals = deals;
	}


	
    
}
