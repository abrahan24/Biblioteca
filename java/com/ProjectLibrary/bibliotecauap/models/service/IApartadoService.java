package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import com.ProjectLibrary.bibliotecauap.models.entity.Apartado;

public interface IApartadoService {
    public List<Apartado> findAll();

	public void save(Apartado apartado);

	public Apartado findOne(Long id);

	public void delete(Long id);
	
}