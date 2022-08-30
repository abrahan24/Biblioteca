package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import com.ProjectLibrary.bibliotecauap.models.entity.Previo;

public interface IPrevioService {
    public List<Previo> findAll();

	public void save(Previo previo);

	public Previo findOne(Long id);

	public void delete(Long id);
}
