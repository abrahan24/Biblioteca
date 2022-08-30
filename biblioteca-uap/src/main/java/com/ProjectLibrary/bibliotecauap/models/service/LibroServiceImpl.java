package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectLibrary.bibliotecauap.models.dao.ILibroDao;
import com.ProjectLibrary.bibliotecauap.models.entity.Libro;
@Service
public class LibroServiceImpl implements ILibroService {

    @Autowired
    private ILibroDao libroDao;

    @Override
    public List<Libro> findAll() {
        // TODO Auto-generated method stub
        return (List<Libro>) libroDao.findAll();
    }

    @Override
    public void save(Libro Libro) {
        // TODO Auto-generated method stub
        libroDao.save(Libro);
    }

    @Override
    public Libro findOne(Long id) {
        // TODO Auto-generated method stub
        return libroDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        libroDao.deleteById(id);
    }
    
}
