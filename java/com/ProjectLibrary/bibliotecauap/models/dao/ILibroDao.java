package com.ProjectLibrary.bibliotecauap.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ProjectLibrary.bibliotecauap.models.entity.Libro;

public interface ILibroDao extends CrudRepository<Libro, Long>{
    
}
