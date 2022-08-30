package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectLibrary.bibliotecauap.models.dao.ISubcategoriaDao;
import com.ProjectLibrary.bibliotecauap.models.entity.Subcategoria;

@Service
public class SubcategoriaServiceImpl implements ISubcategoriaService{

    @Autowired
    private ISubcategoriaDao sudcategoriaDao;
    
    @Override
    public List<Subcategoria> findAll() {
 
        return (List<Subcategoria>) sudcategoriaDao.findAll();
    }

    @Override
    public void save(Subcategoria subcategoria) {
   
        sudcategoriaDao.save(subcategoria);
    }

    @Override
    public Subcategoria findOne(Long id) {
       
        return sudcategoriaDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
   
        sudcategoriaDao.deleteById(id);
    }
    
}
