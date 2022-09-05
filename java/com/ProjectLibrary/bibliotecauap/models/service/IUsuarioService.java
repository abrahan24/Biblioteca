package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import com.ProjectLibrary.bibliotecauap.models.entity.Usuario;

public interface IUsuarioService {
    public List<Usuario> findAll();

	public void save(Usuario usuario);

	public Usuario findOne(Long id);

	public void delete(Long id);
}
