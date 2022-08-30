package com.ProjectLibrary.bibliotecauap.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ProjectLibrary.bibliotecauap.models.entity.Persona;

public interface IPersonaDao extends CrudRepository<Persona, Long>{
    
}
