package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectLibrary.bibliotecauap.models.dao.IIdiomaDao;
import com.ProjectLibrary.bibliotecauap.models.entity.Idioma;

@Service
public class IdiomaServiceImpl implements IIdiomaService{

    @Autowired
    private IIdiomaDao idiomaDao;
    
    @Override
    public List<Idioma> findAll() {
        // TODO Auto-generated method stub
        return (List<Idioma>) idiomaDao.findAll();
    }

    @Override
    public void save(Idioma idioma) {
        // TODO Auto-generated method stub
        idiomaDao.save(idioma);
    }

    @Override
    public Idioma findOne(Long id) {
        // TODO Auto-generated method stub
        return idiomaDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        idiomaDao.deleteById(id);
    }
    
}
