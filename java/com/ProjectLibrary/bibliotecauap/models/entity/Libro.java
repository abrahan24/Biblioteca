package com.ProjectLibrary.bibliotecauap.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "libro")
@Setter
@Getter
public class Libro implements Serializable{
    
    private static final long serialVersionUID = 2629195288020321924L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_libro;
    private String nom_libro;
    private String estado;
    @Column(length = 10485760)
    private String sinopsis;
    private String portada;

    @DateTimeFormat( pattern = "yyyy-MM-dd")
    private Date fecha_creacion_libro;

    private String pais;

//Tabla Previo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_previo")
    private Previo previo;

//Tabla Categoria
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

//Tabla Subcategoria
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_subcategoria")
    private Subcategoria subcategoria;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "libro", fetch = FetchType.LAZY)
	private List<Ejemplar> ejemplares;
}
