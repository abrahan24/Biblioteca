package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import com.ProjectLibrary.bibliotecauap.models.entity.TipoRequisito;

public interface ITipoRequisitoService {
    public List<TipoRequisito> findAll();

	public void save(TipoRequisito tipoRequisito);

	public TipoRequisito findOne(Long id);

	public void delete(Long id);

}
