package com.ProjectLibrary.bibliotecauap.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "apartado")
@Setter
@Getter
public class Apartado implements Serializable{
    
    private static final long serialVersionUID = 2629195288020321924L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_apartado;
    private String apartado;

//Tabla Estante
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_estante")
    private Estante estante;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "apartado", fetch = FetchType.LAZY)
	private List<Ejemplar> ejemplares;
}
