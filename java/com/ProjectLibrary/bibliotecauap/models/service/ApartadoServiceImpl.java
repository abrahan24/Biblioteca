package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectLibrary.bibliotecauap.models.dao.IApartadoDao;
import com.ProjectLibrary.bibliotecauap.models.entity.Apartado;

@Service    
public class ApartadoServiceImpl implements IApartadoService {

    @Autowired
    private IApartadoDao apartadoDao;

    @Override
    public List<Apartado> findAll() {
        // TODO Auto-generated method stub
        return (List<Apartado>) apartadoDao.findAll();
    }

    @Override
    public void save(Apartado apartado) {
        // TODO Auto-generated method stub
        apartadoDao.save(apartado);
    }

    @Override
    public Apartado findOne(Long id) {
        // TODO Auto-generated method stub
        return apartadoDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        apartadoDao.deleteById(id);
    }

   
    
}
