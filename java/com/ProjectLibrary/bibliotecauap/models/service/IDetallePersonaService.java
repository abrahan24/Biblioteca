package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import com.ProjectLibrary.bibliotecauap.models.entity.DetallePersona;

public interface IDetallePersonaService {
    public List<DetallePersona> findAll();

	public void save(DetallePersona detallePersona);

	public DetallePersona findOne(Long id);

	public void delete(Long id);
}
