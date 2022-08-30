package com.ProjectLibrary.bibliotecauap.models.entity;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "estante")
@Setter
@Getter
public class Estante implements Serializable{
    
    private static final long serialVersionUID = 2629195288020321924L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_estante;
    private String estante;
    private Date fecha_adquisicion;
    private String estado;
    private String descripcion;

//Tabla Previo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_previo")
    private Previo previo;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estante", fetch = FetchType.LAZY)
	private List<Ejemplar> ejemplares;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estante", fetch = FetchType.LAZY)
	private List<Apartado> apartados;
}
