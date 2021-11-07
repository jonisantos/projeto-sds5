package com.devsuperior.dvendas.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dvendas.Entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
