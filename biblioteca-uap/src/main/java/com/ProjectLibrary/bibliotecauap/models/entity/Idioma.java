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
@Table(name = "idioma")
@Setter
@Getter
public class Idioma implements Serializable{
    
    private static final long serialVersionUID = 2629195288020321924L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_idioma;
    private String idioma;
    private String estado;
    private String abreviatura;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idioma", fetch = FetchType.LAZY)
	private List<Ejemplar> ejemplares;
}
