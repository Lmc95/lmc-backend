
package com.portfoliolmc.lucas.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyectos {
    @NotBlank
    private String nombre;
    @NotBlank
    private String descripcion;

    private String img;
    
    private String proyectoUrl;
    
    
    //Constructor
    public dtoProyectos() {
    }

    public dtoProyectos(String nombre, String descripcion, String img, String proyectoUrl) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.img = img;
        this.proyectoUrl = proyectoUrl;
    }
    
    
    //Getter y Setter
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
