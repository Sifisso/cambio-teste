package com.technoplus.cambio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.technoplus.cambio.models.Cambio;
import com.technoplus.cambio.repositories.CambioRepository;

@Service
public class CambioService {
	
	@Autowired
	CambioRepository cambioRepository;
	
	public void buscarCambio() {
		
		RestTemplate restTemplate = new RestTemplate();
		RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
		restTemplate = restTemplateBuilder.build();
		
		Cambio cambio= restTemplate.getForObject("https://open.er-api.com/v6/latest/USD", Cambio.class);
		
		
		save(cambio);
		
	}
	
	public void save(Cambio cambio) {
		
		//cambioRepository.findCambioById(cambio.getId());
		
		cambioRepository.save(cambio);
		
	}
}
	