package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectLibrary.bibliotecauap.models.dao.IPrevioDao;
import com.ProjectLibrary.bibliotecauap.models.entity.Previo;
@Service
public class PrevioServiceImpl  implements IPrevioService{

    @Autowired
    private IPrevioDao previoDao; 

    @Override
    public List<Previo> findAll() {
        // TODO Auto-generated method stub
        return (List<Previo>) previoDao.findAll();
    }

    @Override
    public void save(Previo previo) {
        // TODO Auto-generated method stub
        previoDao.save(previo);
    }

    @Override
    public Previo findOne(Long id) {
        // TODO Auto-generated method stub
        return previoDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        previoDao.deleteById(id);
    }
    
}
