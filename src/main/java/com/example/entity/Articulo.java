package com.example.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


public class Articulo {
    
@Data
@Entity
@Table(name="articulos") 
public class articulo implements Serializable {
        @Id
        private Long id;
        private String Nombre;
        private String Descripcion;
        private Long Existencias;
        private Long Precio;
        private String Imagen;
    }
}