package com.avisos.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Avisos {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String titulo;
	@Column(columnDefinition = "TEXT", nullable = false)
	private String descrição;
	@Column
	private Date data;
	
	
	public Avisos(Long id, String titulo, String descrição, Date data) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descrição = descrição;
		this.data = data;
	}
	
	

}
