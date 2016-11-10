package com.example.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;

/**
 * Created by Albert on 07/11/2016.
 */
@Entity
public class Jugador {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long Id;
    String name;
    Date fecha_nacimiento;
    int n_canastas;
    int n_asistencias;
    int n_rebotes;
    String posicion;

    public Jugador(long id, String name, Date fecha_nacimiento, int n_canastas, int n_asistencias, int n_rebotes, String posicion) {
        this.Id = id;
        this.name = name;
        this.fecha_nacimiento = fecha_nacimiento;
        this.n_canastas = n_canastas;
        this.n_asistencias = n_asistencias;
        this.n_rebotes = n_rebotes;
        this.posicion = posicion;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getN_canastas() {
        return n_canastas;
    }

    public void setN_canastas(int n_canastas) {
        this.n_canastas = n_canastas;
    }

    public int getN_asistencias() {
        return n_asistencias;
    }

    public void setN_asistencias(int n_asistencias) {
        this.n_asistencias = n_asistencias;
    }

    public int getN_rebotes() {
        return n_rebotes;
    }

    public void setN_rebotes(int n_rebotes) {
        this.n_rebotes = n_rebotes;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jugador jugador = (Jugador) o;

        if (Id != jugador.Id) return false;
        if (n_canastas != jugador.n_canastas) return false;
        if (n_asistencias != jugador.n_asistencias) return false;
        if (n_rebotes != jugador.n_rebotes) return false;
        if (name != null ? !name.equals(jugador.name) : jugador.name != null) return false;
        if (fecha_nacimiento != null ? !fecha_nacimiento.equals(jugador.fecha_nacimiento) : jugador.fecha_nacimiento != null)
            return false;
        return posicion != null ? posicion.equals(jugador.posicion) : jugador.posicion == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (Id ^ (Id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (fecha_nacimiento != null ? fecha_nacimiento.hashCode() : 0);
        result = 31 * result + n_canastas;
        result = 31 * result + n_asistencias;
        result = 31 * result + n_rebotes;
        result = 31 * result + (posicion != null ? posicion.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", n_canastas=" + n_canastas +
                ", n_asistencias=" + n_asistencias +
                ", n_rebotes=" + n_rebotes +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}