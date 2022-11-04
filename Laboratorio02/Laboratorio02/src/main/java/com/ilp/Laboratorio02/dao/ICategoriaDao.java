/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.ilp.Laboratorio02.dao;

import com.ilp.Laboratorio02.dominio.Categoria;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Admin
 */
public interface ICategoriaDao extends CrudRepository<Categoria, Integer> {
    
    
}
