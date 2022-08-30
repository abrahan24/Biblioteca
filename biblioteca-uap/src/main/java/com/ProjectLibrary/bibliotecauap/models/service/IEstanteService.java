package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import com.ProjectLibrary.bibliotecauap.models.entity.Estante;

public interface IEstanteService {
    public List<Estante> findAll();

	public void save(Estante estante);

	public Estante findOne(Long id);

	public void delete(Long id);
}
