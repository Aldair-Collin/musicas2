/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ilp.Laboratorio02.servicios;

import com.ilp.Laboratorio02.dao.ICategoriaDao;
import com.ilp.Laboratorio02.dominio.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Admin
 */
@Service
public class ImplCategoriaService implements ICategoriaService {

    @Autowired
    private ICategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> listarCategoria() {
        return (List<Categoria>) categoriaDao.findAll();
    }

    @Override
    @Transactional
    public void guardarCategoria(Categoria categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void eliminarCategoria(Categoria categoria) {
        categoriaDao.delete(categoria);
    }

    @Override
    @Transactional(readOnly = true)
    public Categoria encontrarCategoria(Categoria categoria) {
        return categoriaDao.findById(categoria.getId()).orElse(null);
    }

}
