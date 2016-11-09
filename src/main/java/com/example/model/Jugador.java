package com.example.model;

/**
 * Created by Albert on 07/11/2016.
 */
public class Jugador {
    int id;
    String name;
    String fecha_nacimiento;
    int n_canastas;
    int n_asistencias;
    int n_rebotes;
    String posicion;

    public Jugador(int id, String name, String fecha_nacimiento, int n_canastas, int n_asistencias, int n_rebotes, String posicion) {
        this.id = id;
        this.name = name;
        this.fecha_nacimiento = fecha_nacimiento;
        this.n_canastas = n_canastas;
        this.n_asistencias = n_asistencias;
        this.n_rebotes = n_rebotes;
        this.posicion = posicion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
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
        if (!(o instanceof Jugador)) return false;

        Jugador jugador = (Jugador) o;

        if (id != jugador.id) return false;
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
        int result = id;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", fecha_nacimiento='" + fecha_nacimiento + '\'' +
                ", n_canastas=" + n_canastas +
                ", n_asistencias=" + n_asistencias +
                ", n_rebotes=" + n_rebotes +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}
