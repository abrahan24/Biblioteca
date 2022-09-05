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
@Table(name = "tiporequisito")
@Setter
@Getter
public class TipoRequisito implements Serializable{
    
    private static final long serialVersionUID = 2629195288020321924L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tiporequisito;
    private String tipo_requisito;           //obligatorio o opcional
    private String estado;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoRequisito", fetch = FetchType.LAZY)
	private List<Requisito> requisitos;
}
