package com.example.repository;


import com.example.model.Jugador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Albert on 07/11/2016.
 */
public interface jugadorRepository {

    //Buscar jugadores por nombre, de manera que no sea necesario introducir el nombre completo.

    @Query("SELECT name from Jugador where name = 'playername%'")
    List<Jugador> findJugadorByName(@Param("playerName") String name);


    //Buscar jugadores que hayan conseguido un número mayor o igual a un número de canastas especificado como parámetro.

    //Buscar jugadores que hayan efectuado un número de asistencias dentro de un rango especificado como parámetro.

    //Buscar jugadores que pertenezcan a una posición específica, por ejemplo: base

    //Buscar jugadores que hayan nacido en una fecha anterior a una fecha especificada como parámetro.

    //Agrupar los jugadores por la posición del campo y devolver para cada grupo la siguiente información: la media de canastas, asistencias y rebotes.

    //Lo mismo que el punto anterior pero devolviendo la media, el máximo y el mínimo de canastas, asistencias y rebotes.
}
