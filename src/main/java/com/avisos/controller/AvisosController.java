package com.avisos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avisos.model.Avisos;
import com.avisos.service.AvisosServcie;

@RestController
@RequestMapping("/api/avisos")
public class AvisosController {

	@Autowired
	private AvisosServcie service;
	
	@GetMapping
	public List<Avisos> buscarTodos() {
		return service.findAll();
	}
}
