
package com.portfoliolmc.lucas.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;
    @NotNull
    private String nombre;
    @NotNull
    private String descripcion;
    
    private String img;
    
    @NotNull
    private String proyectoUrl;
    
    //Constructor
    public Proyectos() {
    }

    public Proyectos(String nombre, String descripcion, String img, String proyectoUrl) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.img = img;
        this.proyectoUrl = proyectoUrl;
    }
    
    
    //Getter y Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getProyectoUrl() {
        return proyectoUrl;
    }

    public void setProyectoUrl(String proyectoUrl) {
        this.proyectoUrl = proyectoUrl;
    }
  
    
}
