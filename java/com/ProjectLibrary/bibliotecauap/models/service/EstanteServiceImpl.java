package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectLibrary.bibliotecauap.models.dao.IEstanteDao;
import com.ProjectLibrary.bibliotecauap.models.entity.Estante;

@Service
public class EstanteServiceImpl implements IEstanteService {

    @Autowired
    private IEstanteDao estanteDao; 

    @Override
    public List<Estante> findAll() {
        // TODO Auto-generated method stub
        return (List<Estante>) estanteDao.findAll();
    }

    @Override
    public void save(Estante estante) {
        // TODO Auto-generated method stub
        estanteDao.save(estante);
    }

    @Override
    public Estante findOne(Long id) {
        // TODO Auto-generated method stub
        return estanteDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        estanteDao.deleteById(id);
    }
    
}
