package com.technoplus.cambio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.technoplus.cambio.models.Cambio;
import com.technoplus.cambio.repositories.CambioRepository;
import com.technoplus.cambio.services.CambioService;

@RestController
@RequestMapping("/cambios")
public class CambioController {
	
	@Autowired
	CambioService cambioService;
	
	@Autowired
	CambioRepository cambioRepository;
	
	
/*	@GetMapping("/")
	public String Verificarcambio() {
		
	cambioService.buscarCambio();
	
		return "cambio_teste";
	}*/
	
	/* Comando para listar todos, atenção, cada clique ou cada "refresh", implica mais um registo, 
	diferenciando só pelo id do registo.
	
	*/
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<List<Cambio>> dadosDoCambio(){
		cambioService.buscarCambio();
		List<Cambio> obj = cambioService.buscarTodos();
		
		return ResponseEntity.ok().body(obj);
	}
	
	/*Cada registo feito, pode vê-lo pelo id, deste que acrescente barra e de seguida o id */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Cambio> dadosDoCambioPorID(@PathVariable Integer id){
		Cambio obj = cambioService.buscarCambioPorId(id);
		
		return ResponseEntity.ok().body(obj);
	}
	

}
