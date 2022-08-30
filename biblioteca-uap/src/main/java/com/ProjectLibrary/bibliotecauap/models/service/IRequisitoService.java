package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import com.ProjectLibrary.bibliotecauap.models.entity.Requisito;

public interface IRequisitoService {
    public List<Requisito> findAll();

	public void save(Requisito requisito);

	public Requisito findOne(Long id);

	public void delete(Long id);
}
