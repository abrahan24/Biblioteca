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
@Table(name = "persona")
@Setter
@Getter
public class Persona implements Serializable{
    
    private static final long serialVersionUID = 2629195288020321924L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;
    private String nombre;
    private String ap_paterno;
    private String ap_materno;
    private String ci;
    private String estado;
    private String numero_contacto;
    private String numero_contacto_referencias;

//Tabla TipoPersona
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipopersona")
    private TipoPersona tipoPersona;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona", fetch = FetchType.LAZY)
	private List<Usuario> usuarios;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona", fetch = FetchType.LAZY)
	private List<Prestamo> prestamos;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona", fetch = FetchType.LAZY)
	private List<DetallePersona> detallePersonas;
}
