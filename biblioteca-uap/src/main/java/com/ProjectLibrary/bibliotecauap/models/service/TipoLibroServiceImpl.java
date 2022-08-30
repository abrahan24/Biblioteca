package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectLibrary.bibliotecauap.models.dao.ITipoLibroDao;
import com.ProjectLibrary.bibliotecauap.models.entity.TipoLibro;
@Service
public class TipoLibroServiceImpl implements ITipoLibroService {

    @Autowired
    private ITipoLibroDao tipoLibroDao;
    
    @Override
    public List<TipoLibro> findAll() {
        // TODO Auto-generated method stub
        return (List<TipoLibro>) tipoLibroDao.findAll();
    }

    @Override
    public void save(TipoLibro tipoLibro) {
        // TODO Auto-generated method stub
        tipoLibroDao.save(tipoLibro);
    }

    @Override
    public TipoLibro findOne(Long id) {
        // TODO Auto-generated method stub
        return tipoLibroDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        tipoLibroDao.deleteById(id);
    }
    
}
