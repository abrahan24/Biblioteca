package com.ProjectLibrary.bibliotecauap.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ProjectLibrary.bibliotecauap.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
    
}
