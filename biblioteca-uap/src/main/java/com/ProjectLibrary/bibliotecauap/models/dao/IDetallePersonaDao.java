package com.ProjectLibrary.bibliotecauap.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ProjectLibrary.bibliotecauap.models.entity.DetallePersona;

public interface IDetallePersonaDao extends CrudRepository<DetallePersona,Long>{
    
}
