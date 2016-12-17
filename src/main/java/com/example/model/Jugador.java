package com.example.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
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

    @ManyToOne  //un jugador sólo puede pertenecer a un equipo
    private Equipo equipo;

    public Jugador(long id, String name, Date fecha_nacimiento, int n_canastas, int n_asistencias, int n_rebotes, String posicion, Equipo equipo) {
        this.Id = id;
        this.name = name;
        this.fecha_nacimiento = fecha_nacimiento;
        this.n_canastas = n_canastas;
        this.n_asistencias = n_asistencias;
        this.n_rebotes = n_rebotes;
        this.posicion = posicion;
        this.equipo = equipo;
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

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
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
                ", equipo=" + equipo +
                '}';
    }
}