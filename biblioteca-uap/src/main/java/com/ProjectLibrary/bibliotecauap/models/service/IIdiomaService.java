package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import com.ProjectLibrary.bibliotecauap.models.entity.Idioma;

public interface IIdiomaService {
    public List<Idioma> findAll();

	public void save(Idioma idioma);

	public Idioma findOne(Long id);

	public void delete(Long id);
}
