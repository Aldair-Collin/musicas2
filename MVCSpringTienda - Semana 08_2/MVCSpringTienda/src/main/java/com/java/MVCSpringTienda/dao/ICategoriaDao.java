package com.java.MVCSpringTienda.dao;

import com.java.MVCSpringTienda.dominio.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface ICategoriaDao extends CrudRepository<Categoria,Integer> {

}
