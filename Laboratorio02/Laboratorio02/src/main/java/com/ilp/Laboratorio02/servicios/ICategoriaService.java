/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.ilp.Laboratorio02.servicios;

import com.ilp.Laboratorio02.dominio.Categoria;
import java.util.List;



/**
 *
 * @author Admin
 */
public interface ICategoriaService{
    
    public List<Categoria> listarCategoria();
   
   public void guardarCategoria(Categoria categoria);
   
   public void eliminarCategoria(Categoria categoria);
   
   public Categoria encontrarCategoria(Categoria categoria);
    
}
