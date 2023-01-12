package com.avisos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avisos.model.Avisos;
import com.avisos.repository.IAvisosRepository;

@Service
public class AvisosServcie{
	
	@Autowired
	private IAvisosRepository repository;
	
	public List<Avisos> findAll() {
		return repository.findAll();
	}

}
