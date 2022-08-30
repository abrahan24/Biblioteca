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
@Table(name = "tipopersona")
@Setter
@Getter
public class TipoPersona implements Serializable{
    
    private static final long serialVersionUID = 2629195288020321924L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tipopersona;
    private String tipopersona;     //estudiante - docente - administrativo - externo
    private String estado;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoPersona", fetch = FetchType.LAZY)
	private List<Persona> personas;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoPersona", fetch = FetchType.LAZY)
	private List<DetallePersona> detallePersonas;
}
