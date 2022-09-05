package com.ProjectLibrary.bibliotecauap.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ProjectLibrary.bibliotecauap.models.entity.Estante;

public interface IEstanteDao extends CrudRepository<Estante, Long>{
    
}
