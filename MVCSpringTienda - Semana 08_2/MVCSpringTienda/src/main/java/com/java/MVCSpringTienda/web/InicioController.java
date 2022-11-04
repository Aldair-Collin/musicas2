
package com.java.MVCSpringTienda.web;

import com.java.MVCSpringTienda.dominio.Categoria;
import com.java.MVCSpringTienda.dominio.Cliente;
import com.java.MVCSpringTienda.servicios.ICategoriaService;
import com.java.MVCSpringTienda.servicios.IClienteService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InicioController {
    @Autowired
    private ICategoriaService categoriaService;

    @GetMapping("/")
    public String inicio(Model model){
        List<Categoria> categorias= (List<Categoria>) categoriaService.listarCategoria();
        //List<Categoria> categorias= null;
        model.addAttribute("categorias",categorias );
        return "index";
    }
    @GetMapping("/agregar")
    public String agregar(Categoria categoria){

        return "actualizar";
    }

    @PostMapping("/guardar")
    public String guardar(Categoria categoria,Errors errors){
        if(errors.hasErrors()){
            return "actualizar";
        }
        categoriaService.guardarCategoria(categoria);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String editar(Categoria categoria, Model model){
        categoria=categoriaService.encontrarCategoria(categoria);
        model.addAttribute("categoria",categoria);
        return "actualizar";
    }
    @GetMapping("/eliminar/{id}")
    public String eliminar(Categoria categoria){
        categoriaService.eliminarCategoria(categoria);
        return "redirect:/";
    }

}
