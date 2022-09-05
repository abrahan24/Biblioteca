package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectLibrary.bibliotecauap.models.dao.ITipoPersonaDao;
import com.ProjectLibrary.bibliotecauap.models.entity.TipoPersona;

@Service
public class TipoPersonaServiceImpl implements ITipoPersonaService {

    @Autowired
    private ITipoPersonaDao tipoPersonaDao;
    
    @Override
    public List<TipoPersona> findAll() {
        // TODO Auto-generated method stub
        return (List<TipoPersona>) tipoPersonaDao.findAll();
    }

    @Override
    public void save(TipoPersona tipoPersona) {
        // TODO Auto-generated method stub
        tipoPersonaDao.save(tipoPersona);
    }

    @Override
    public TipoPersona findOne(Long id) {
        // TODO Auto-generated method stub
        return tipoPersonaDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        tipoPersonaDao.deleteById(id);
    }
    
}
