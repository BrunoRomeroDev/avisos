package com.avisos.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.avisos.model.Avisos;
import com.avisos.repository.IAvisosRepository;

@RestController

public class AvisosController {


	
	@Autowired
	private IAvisosRepository Iavisorepository;
	
	@GetMapping("/api/avisos/{id}")
	public ResponseEntity<Avisos> buscaId(@PathVariable Long id) {
		return Iavisorepository.findById(id).map((a) ->ResponseEntity.ok(a)).orElse(ResponseEntity.notFound().build());
		
	}
	
	
	@GetMapping("/api/avisos")
	public Stream<Object> buscaTodoscontem(){
		return  Iavisorepository.findAll().stream().filter((a) -> a.getTitulo().contains("segundo")).map((a) ->ResponseEntity.ok(a)) ;
	}
	
	
	@GetMapping("/api/avisos/filtro")
	public List<Avisos> buscaTodosFiltro(){
		return Iavisorepository.findAll().stream().filter((a) -> a.getTitulo().charAt(0) == 'p').collect(Collectors.toList());
	}
	
	@GetMapping("/api/avisos/full")
	public List<Avisos> buscaTodos(){
		return  Iavisorepository.findAll() ;
	}
	
	
	
}
