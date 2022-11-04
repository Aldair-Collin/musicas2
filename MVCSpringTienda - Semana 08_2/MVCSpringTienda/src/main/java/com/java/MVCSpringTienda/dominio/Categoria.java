package com.java.MVCSpringTienda.dominio;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@Entity
@Table(name = "categorias")
public class Categoria implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Integer id;

    private String descripcion;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean estado;


}
