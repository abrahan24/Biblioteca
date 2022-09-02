package com.ProjectLibrary.bibliotecauap.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ProjectLibrary.bibliotecauap.models.entity.TipoLibro;



public interface ITipoLibroDao extends CrudRepository<TipoLibro,Long>{
    
    
    @Query("select tl from TipoLibro tl order by tl.id_tipolibro Asc")
    public List<TipoLibro> getAllAacTipoLibro();

}
