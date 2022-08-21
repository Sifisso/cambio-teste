package com.technoplus.cambio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cambios")
public class CambioController {
	
	
	@GetMapping("/")
	public String Verificarcambio() {
		
	
		return "cambio";
	}

}
