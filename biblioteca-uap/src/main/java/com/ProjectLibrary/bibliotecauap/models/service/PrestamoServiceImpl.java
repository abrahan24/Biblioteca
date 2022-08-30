package com.ProjectLibrary.bibliotecauap.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectLibrary.bibliotecauap.models.dao.IPrestamoDao;
import com.ProjectLibrary.bibliotecauap.models.entity.Prestamo;
@Service
public class PrestamoServiceImpl implements IPrestamoService {

    @Autowired
    private IPrestamoDao prestamoDao; 
    
    @Override
    public List<Prestamo> findAll() {
        // TODO Auto-generated method stub
        return (List<Prestamo>) prestamoDao.findAll();
    }

    @Override
    public void save(Prestamo prestamo) {
        // TODO Auto-generated method stub
        prestamoDao.save(prestamo);
    }

    @Override
    public Prestamo findOne(Long id) {
        // TODO Auto-generated method stub
        return prestamoDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        prestamoDao.deleteById(id);
    }
    
}
