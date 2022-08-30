package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import com.ProjectLibrary.bibliotecauap.models.entity.Libro;

public interface ILibroService {
    public List<Libro> findAll();

	public void save(Libro libro);

	public Libro findOne(Long id);

	public void delete(Long id);
}
