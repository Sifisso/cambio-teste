package com.technoplus.cambio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technoplus.cambio.repositories.CambioRepository;
import com.technoplus.cambio.services.CambioService;

@RestController
@RequestMapping("/cambios")
public class CambioController {
	
	@Autowired
	CambioService cambioService;
	
	@Autowired
	CambioRepository cambioRepository;
	
	
	@GetMapping("/")
	public String Verificarcambio() {
		
	cambioService.buscarCambio();
	
		return "cambio_teste";
	}
	

}
