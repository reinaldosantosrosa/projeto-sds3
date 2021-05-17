package com.devsuperior.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsvendas.DTO.SalesSuccessDTO;
import com.devsuperior.dsvendas.DTO.SalesSumDTO;
import com.devsuperior.dsvendas.entities.Salle;


public interface SeleRepository extends JpaRepository<Salle, Long>  {
	
	@Query("SELECT new com.devsuperior.dsvendas.DTO.SalesSumDTO(obj.seller, sum(obj.amount) )"
			+ " FROM Salle As obj GROUP BY obj.seller ")
	List<SalesSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.devsuperior.dsvendas.DTO.SalesSuccessDTO(obj.seller, sum(obj.visited) , sum(obj.deals) ) "
			+ " FROM Salle As obj GROUP BY obj.seller ")
	List<SalesSuccessDTO> successGroupedBySeller();

}
