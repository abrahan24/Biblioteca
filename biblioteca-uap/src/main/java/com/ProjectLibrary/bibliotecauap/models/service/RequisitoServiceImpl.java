package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectLibrary.bibliotecauap.models.dao.IRequisitoDao;
import com.ProjectLibrary.bibliotecauap.models.entity.Requisito;

@Service
public class RequisitoServiceImpl implements IRequisitoService {

    @Autowired
    private IRequisitoDao requisitoDao;
    
    @Override
    public List<Requisito> findAll() {
        // TODO Auto-generated method stub
        return (List<Requisito>) requisitoDao.findAll();
    }

    @Override
    public void save(Requisito requisito) {
        // TODO Auto-generated method stub
        requisitoDao.save(requisito);
    }

    @Override
    public Requisito findOne(Long id) {
        // TODO Auto-generated method stub
        return requisitoDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        requisitoDao.deleteById(id);
    }
    
}
