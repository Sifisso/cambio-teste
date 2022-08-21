package com.technoplus.cambio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technoplus.cambio.models.Cambio;

@Repository
public interface CambioRepository extends JpaRepository<Cambio, Integer>{


	
	
}