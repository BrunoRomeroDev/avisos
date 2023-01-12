package com.avisos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avisos.model.Avisos;

public interface IAvisosRepository extends JpaRepository<Avisos, Long>{

}
