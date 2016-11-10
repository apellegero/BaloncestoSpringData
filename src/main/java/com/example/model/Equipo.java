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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Equipo equipo = (Equipo) o;

        if (Id != equipo.Id) return false;
        if (nombre != null ? !nombre.equals(equipo.nombre) : equipo.nombre != null) return false;
        if (localidad != null ? !localidad.equals(equipo.localidad) : equipo.localidad != null) return false;
        return fecha_creacion != null ? fecha_creacion.equals(equipo.fecha_creacion) : equipo.fecha_creacion == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (Id ^ (Id >>> 32));
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (localidad != null ? localidad.hashCode() : 0);
        result = 31 * result + (fecha_creacion != null ? fecha_creacion.hashCode() : 0);
        return result;
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