package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectLibrary.bibliotecauap.models.dao.IDetallePersonaDao;
import com.ProjectLibrary.bibliotecauap.models.entity.DetallePersona;

@Service
public class DetallePersonaServiceImpl implements IDetallePersonaService{

    @Autowired
    private IDetallePersonaDao detallePersonaDao;

    @Override
    public List<DetallePersona> findAll() {
        return (List<DetallePersona>) detallePersonaDao.findAll();
    }

    @Override
    public void save(DetallePersona detallePersona) {
        detallePersonaDao.save(detallePersona);
    }

    @Override
    public DetallePersona findOne(Long id) {
        return detallePersonaDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        detallePersonaDao.deleteById(id);
    }
    
}
