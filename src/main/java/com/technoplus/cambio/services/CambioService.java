package com.technoplus.cambio.services;

import java.util.List;

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
	
	/*Método para registo*/
	public void save(Cambio cambio) {
		
		cambioRepository.save(cambio);
		
	}
	
	/*Método para buscar todos*/
	public Cambio buscarCambioPorId(Integer id) {
		Cambio obj = cambioRepository.findById(id).get();
		
		return obj;
	}
	
	
	/*Método para buscar por id*/
	public List<Cambio>buscarTodos(){
		List<Cambio> obj =cambioRepository.findAll();
		
		return obj;
	}
}
	