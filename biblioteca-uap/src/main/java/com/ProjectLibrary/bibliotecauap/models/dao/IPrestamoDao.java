package com.ProjectLibrary.bibliotecauap.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ProjectLibrary.bibliotecauap.models.entity.Prestamo;

public interface IPrestamoDao extends CrudRepository<Prestamo, Long>{
    
}
