package com.devsuperior.dvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dvendas.Entities.Sale;
import com.devsuperior.dvendas.dto.SaleDTO;
import com.devsuperior.dvendas.repositores.SaleRepository;
import com.devsuperior.dvendas.repositores.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repo;
	
	@Autowired
	private SellerRepository sellerRepo;
	
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepo.findAll();
		Page<Sale> result = repo.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
}
