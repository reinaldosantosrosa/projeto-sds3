package com.devsuperior.dsvendas.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsvendas.DTO.SalesSuccessDTO;
import com.devsuperior.dsvendas.DTO.SalesSumDTO;
import com.devsuperior.dsvendas.DTO.salleDTO;
import com.devsuperior.dsvendas.entities.Salle;
import com.devsuperior.dsvendas.repositories.SeleRepository;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service
public class SaleServices {
	
	@Autowired
	private SeleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	
	@Transactional(readOnly=true)
	public Page<salleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Salle> result = repository.findAll(pageable);
		return result.map(x -> new salleDTO(x));
			
	}
	
	@Transactional(readOnly=true)
	public List<SalesSumDTO> amountGroupedBySeller(){
		  return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly=true)
	public List<SalesSuccessDTO> successGroupedBySeller(){
		  return repository.successGroupedBySeller();
	}
	
	
}
