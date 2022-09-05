package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import com.ProjectLibrary.bibliotecauap.models.entity.TipoLibro;

public interface ITipoLibroService {
    public List<TipoLibro> findAll();

	public void save(TipoLibro tipoLibro);

	public TipoLibro findOne(Long id);

	public void delete(Long id);

}
