package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectLibrary.bibliotecauap.models.dao.IEjemplarDao;
import com.ProjectLibrary.bibliotecauap.models.entity.Ejemplar;

@Service
public class EjemplarServiceImpl implements IEjemplarService{

    @Autowired
    private IEjemplarDao ejemplarDao;

    @Override
    public List<Ejemplar> findAll() {
        // TODO Auto-generated method stub
        return (List<Ejemplar>) ejemplarDao.findAll();
    }

    @Override
    public void save(Ejemplar ejemplar) {
        // TODO Auto-generated method stub
        ejemplarDao.save(ejemplar);
    }

    @Override
    public Ejemplar findOne(Long id) {
        // TODO Auto-generated method stub
        return ejemplarDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        ejemplarDao.deleteById(id);
    }
    
}
