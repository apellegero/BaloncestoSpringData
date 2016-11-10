package com.example.repository;


import com.example.model.Jugador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by Albert on 07/11/2016.
 */
public interface JugadorRepository {

    //Buscar jugadores por nombre, de manera que no sea necesario introducir el nombre completo.
    @Query("SELECT jgdr FROM Jugador jgdr WHERE jgdr.name LIKE 'name%'")
    List<Jugador> findJugadorByName(@Param("name") String name);

    //Buscar jugadores que hayan conseguido un número mayor o igual a un número de canastas especificado como parámetro.
    @Query("SELECT jgdr FROM Jugador jgdr WHERE jgdr.n_canastas >= canastas")
    List<Jugador> findByCanastas(@Param("canastas") int canastas);

    //Buscar jugadores que hayan efectuado un número de asistencias dentro de un rango especificado como parámetro.
    @Query("SELECT jgdr FROM Jugador jgdr WHERE jgdr.n_asistencias >= min AND jgdr.n_asistencias <= max")
    List<Jugador> findJugadorListAsistenciasBetween(@Param("min") int min, @Param("max") int max);

    //Buscar jugadores que pertenezcan a una posición específica, por ejemplo: base
    @Query("SELECT jgdr FROM Jugador jgdr WHERE jgdr.posicion = 'posicion'")
    List<Jugador> findByPosicion(@Param("posicion") String posicion);

    //Buscar jugadores que hayan nacido en una fecha anterior a una fecha especificada como parámetro.
    List<Jugador> findByBirthdayBefore(Date fecha);

    //Agrupar los jugadores por la posición del campo y devolver para cada grupo la siguiente información: la media de canastas, asistencias y rebotes.
    @Query("SELECT jgdr.posicion,AVG(jgdr.n_canastas),AVG(jgdr.n_asistencias),AVG(jgdr.n_rebotes) FROM Jugador jgdr GROUP BY jgdr.posicion")
    List<Jugador> findByPosicionMedia();

    //Lo mismo que el punto anterior pero devolviendo la media, el máximo y el mínimo de canastas, asistencias y rebotes.
    @Query("SELECT jgdr.posicion,AVG(jgdr.n_canastas),MIN(jgdr.n_canastas),MAX(jgdr.n_canastas),AVG(jgdr.n_asistencias),MIN(jgdr.n_asistencias),MAX(jgdr.n_asistencias),AVG(jgdr.n_rebotes),MIN(jgdr.n_rebotes),MAX(jgdr.n_rebotes) FROM Jugador jgdr GROUP BY jgdr.posicion")
    List<Jugador> findByPosicionAvgMinMax();
}
