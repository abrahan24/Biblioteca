package com.ProjectLibrary.bibliotecauap.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ProjectLibrary.bibliotecauap.models.entity.Categoria;

public interface ICategoriaDao extends CrudRepository<Categoria, Long>{
    
}
