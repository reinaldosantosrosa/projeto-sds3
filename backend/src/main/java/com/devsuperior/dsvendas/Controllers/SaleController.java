package com.devsuperior.dsvendas.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	

}
