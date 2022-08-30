package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import com.ProjectLibrary.bibliotecauap.models.entity.Subcategoria;

public interface ISubcategoriaService {
    public List<Subcategoria> findAll();

	public void save(Subcategoria subcategoria);

	public Subcategoria findOne(Long id);

	public void delete(Long id);
}
