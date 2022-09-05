package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectLibrary.bibliotecauap.models.dao.ITipoRequisitoDao;
import com.ProjectLibrary.bibliotecauap.models.entity.TipoRequisito;

@Service
public class TipoRequisitoServiceImpl implements ITipoRequisitoService {

    @Autowired
    private ITipoRequisitoDao tipoRequisitoDao;
    
    @Override
    public List<TipoRequisito> findAll() {
        // TODO Auto-generated method stub
        return (List<TipoRequisito>) tipoRequisitoDao.findAll();
    }

    @Override
    public void save(TipoRequisito tipoRequisito) {
        // TODO Auto-generated method stub
        tipoRequisitoDao.save(tipoRequisito);
    }

    @Override
    public TipoRequisito findOne(Long id) {
        // TODO Auto-generated method stub
        return tipoRequisitoDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        tipoRequisitoDao.deleteById(id);
    }
    
}
