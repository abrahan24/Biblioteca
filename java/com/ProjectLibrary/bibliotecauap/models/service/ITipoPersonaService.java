package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import com.ProjectLibrary.bibliotecauap.models.entity.TipoPersona;

public interface ITipoPersonaService {
    public List<TipoPersona> findAll();

	public void save(TipoPersona TipoPersona);

	public TipoPersona findOne(Long id);

	public void delete(Long id);
}