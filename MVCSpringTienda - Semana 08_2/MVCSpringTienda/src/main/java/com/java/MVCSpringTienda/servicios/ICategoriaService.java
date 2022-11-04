package com.java.MVCSpringTienda.servicios;

import com.java.MVCSpringTienda.dominio.Categoria;

import java.util.List;

public interface ICategoriaService {
    public List<Categoria> listarCategoria();

    public void guardarCategoria(Categoria categoria);

    public void eliminarCategoria(Categoria categoria);

    public Categoria encontrarCategoria(Categoria categoria);
}
