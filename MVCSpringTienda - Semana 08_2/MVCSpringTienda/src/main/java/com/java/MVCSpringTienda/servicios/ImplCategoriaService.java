package com.java.MVCSpringTienda.servicios;

import com.java.MVCSpringTienda.dao.ICategoriaDao;
import com.java.MVCSpringTienda.dominio.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ImplCategoriaService implements ICategoriaService{

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
