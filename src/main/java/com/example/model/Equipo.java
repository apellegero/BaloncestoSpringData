package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;

/**
 * Created by apellegero on 10/11/2016.
 */
@Entity
public class Equipo {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long Id;
    String nombre;
    String localidad;
    Date fecha_creacion;


    public Equipo(long id, String nombre, String localidad, Date fecha_creacion) {
        Id = id;
        this.nombre = nombre;
        this.localidad = localidad;
        this.fecha_creacion = fecha_creacion;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "Id=" + Id +
                ", nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", fecha_creacion=" + fecha_creacion +
                '}';
    }
}