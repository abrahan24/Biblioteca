package com.ProjectLibrary.bibliotecauap.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ProjectLibrary.bibliotecauap.models.entity.TipoLibro;

public interface ITipoLibroDao extends CrudRepository<TipoLibro,Long>{
    
}
