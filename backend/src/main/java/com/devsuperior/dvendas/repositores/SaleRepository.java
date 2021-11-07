package com.devsuperior.dvendas.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dvendas.Entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
