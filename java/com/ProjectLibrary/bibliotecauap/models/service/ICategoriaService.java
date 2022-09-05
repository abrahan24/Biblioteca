package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import com.ProjectLibrary.bibliotecauap.models.entity.Categoria;

public interface ICategoriaService {
    public List<Categoria> findAll();

	public void save(Categoria categoria);

	public Categoria findOne(Long id);

	public void delete(Long id);
}
