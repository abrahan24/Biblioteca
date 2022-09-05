package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import com.ProjectLibrary.bibliotecauap.models.entity.Ejemplar;

public interface IEjemplarService {
    public List<Ejemplar> findAll();

	public void save(Ejemplar ejemplar);

	public Ejemplar findOne(Long id);

	public void delete(Long id);
}
