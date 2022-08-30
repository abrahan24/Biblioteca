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
@Table(name = "ejemplar")
@Setter
@Getter
public class Ejemplar implements Serializable{
    
    private static final long serialVersionUID = 2629195288020321924L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ejemplar;
    private String nom_ejemplar;
    private String estado;
    private Date fecha_publicacion;


//Tabla Estante
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_estante")
    private Estante estante;

//Tabla Apartado
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_apartado")
    private Apartado apartado;
    
//Tabla TipoLibro
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipolibro")
    private TipoLibro tipoLibro;

//Tabla Libro
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_libro")
    private Libro libro;

//Tabla Idioma
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_idioma")
    private Idioma idioma;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ejemplar", fetch = FetchType.LAZY)
	private List<Disponible> disponibles;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ejemplar", fetch = FetchType.LAZY)
	private List<Prestamo> prestamos;
}
