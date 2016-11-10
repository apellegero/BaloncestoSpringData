package com.example.repository;

import com.example.model.Equipo;

import java.util.List;

/**
 * Created by apellegero on 10/11/2016.
 */
public interface EquipoRepository {
    //Consulta los equipos existentes en una localidad determinada.
    List<Equipo> findByLocalidad(String localidad);

    //Devuelve todos los jugadores de un equipo, a partir del nombre completo del equipo.
    List<Equipo>
    //Devuelve todos los jugadores de un equipo, que además jueguen en la misma posición (parámetro adicional de la consulta), por ejemplo, alero.
    //Devuelve el jugador que más canastas ha realizado de un equipo determinado como parámetro.
}
