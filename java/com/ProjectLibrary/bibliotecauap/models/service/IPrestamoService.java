package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import com.ProjectLibrary.bibliotecauap.models.entity.Prestamo;

public interface IPrestamoService {
    public List<Prestamo> findAll();

	public void save(Prestamo prestamo);

	public Prestamo findOne(Long id);

	public void delete(Long id);
}
