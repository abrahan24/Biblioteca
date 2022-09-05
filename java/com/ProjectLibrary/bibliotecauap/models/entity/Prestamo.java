package com.ProjectLibrary.bibliotecauap.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "prestamo")
@Setter
@Getter
public class Prestamo implements Serializable{
    
    private static final long serialVersionUID = 2629195288020321924L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_prestamo;
    private String estado;
    @Column(length = 10485760)
    private String descripcion;
    private Date fecha_prestamo;
    private Date fecha_devolucion;
    private Date fecha_demora;
    @Column(length = 10485760)
    private String observacion;

//Tabla Ejemplar
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_ejemplar")
    private Ejemplar ejemplar;

//Tabla Persona
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_persona")
    private Persona persona;
}
