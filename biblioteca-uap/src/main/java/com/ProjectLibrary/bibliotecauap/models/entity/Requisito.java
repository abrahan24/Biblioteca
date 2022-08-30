package com.ProjectLibrary.bibliotecauap.models.entity;

import java.io.Serializable;

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
@Table(name = "requisito")
@Setter
@Getter
public class Requisito implements Serializable{
    
    private static final long serialVersionUID = 2629195288020321924L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_requisito;
    private String requisito;
    private String estado;

//Tabla Previo
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_previo")
    private Previo previo;

//Tabla TipoRequisito
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tiporequisito")
    private TipoRequisito tipoRequisito;
}
