package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectLibrary.bibliotecauap.models.dao.ICategoriaDao;
import com.ProjectLibrary.bibliotecauap.models.entity.Categoria;

@Service
public class CategoriaServiceImpl implements ICategoriaService{

    @Autowired
    private ICategoriaDao categoriaDao;

    @Override
    public List<Categoria> findAll() {
        // TODO Auto-generated method stub
        return (List<Categoria>) categoriaDao.findAll();
    }

    @Override
    public void save(Categoria categoria) {
        // TODO Auto-generated method stub
        categoriaDao.save(categoria);
    }

    @Override
    public Categoria findOne(Long id) {
        // TODO Auto-generated method stub
        return categoriaDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        categoriaDao.deleteById(id);
    }
    
}
