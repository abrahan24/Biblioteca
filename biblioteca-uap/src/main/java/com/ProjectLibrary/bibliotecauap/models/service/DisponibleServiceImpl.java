package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectLibrary.bibliotecauap.models.dao.IDisponibleDao;
import com.ProjectLibrary.bibliotecauap.models.entity.Disponible;

@Service
public class DisponibleServiceImpl implements IDisponibleService {
    
    @Autowired
    private IDisponibleDao disponibleDao;

    @Override
    public List<Disponible> findAll() {
        // TODO Auto-generated method stub
        return (List<Disponible>) disponibleDao.findAll();
    }

    @Override
    public void save(Disponible disponible) {
        // TODO Auto-generated method stub
        disponibleDao.save(disponible);
    }

    @Override
    public Disponible findOne(Long id) {
        // TODO Auto-generated method stub
        return disponibleDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        disponibleDao.deleteById(id);
    }

    
}
