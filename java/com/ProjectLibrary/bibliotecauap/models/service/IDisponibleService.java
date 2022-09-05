package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import com.ProjectLibrary.bibliotecauap.models.entity.Disponible;

public interface IDisponibleService {
    public List<Disponible> findAll();

	public void save(Disponible disponible);

	public Disponible findOne(Long id);

	public void delete(Long id);
}
