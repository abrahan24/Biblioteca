package com.ProjectLibrary.bibliotecauap.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "previo")
@Setter
@Getter
public class Previo implements Serializable{        //Predio = lugar de algo 
    
    private static final long serialVersionUID = 2629195288020321924L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_previo;
    private String estado;
    private String predio;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "previo", fetch = FetchType.LAZY)
	private List<Libro> libros;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "previo", fetch = FetchType.LAZY)
	private List<Requisito> requisitos;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "previo", fetch = FetchType.LAZY)
	private List<Estante> estantes;
}
