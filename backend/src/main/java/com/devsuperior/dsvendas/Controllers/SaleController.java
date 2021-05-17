package com.devsuperior.dsvendas.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.DTO.SalesSuccessDTO;
import com.devsuperior.dsvendas.DTO.SalesSumDTO;
import com.devsuperior.dsvendas.DTO.salleDTO;
import com.devsuperior.dsvendas.services.SaleServices;

@RestController
@RequestMapping( value = "/vendas")
public class SaleController {
	
	@Autowired
	private SaleServices service;
	
	@GetMapping
	public ResponseEntity<Page<salleDTO>> findAll(Pageable pageable)
	{
		Page<salleDTO> list = service.findAll(pageable);
		
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value="/amount-by-seller")
	public ResponseEntity<List<SalesSumDTO>> amountGroupedBySeller()
	{
		List<SalesSumDTO> list = service.amountGroupedBySeller();
		
		return ResponseEntity.ok(list);
		
	}
	
	@GetMapping(value="/success-by-seller")
	public ResponseEntity<List<SalesSuccessDTO>> successGroupedBySeller()
	{
		List<SalesSuccessDTO> list = service.successGroupedBySeller();
		
		return ResponseEntity.ok(list);
		
	}
	

}
