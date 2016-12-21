package com.example.repository;


import com.example.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by Albert on 07/11/2016.
 */
public interface JugadorRepository extends JpaRepository<Jugador,Long> {

    //Buscar jugadores por nombre, de manera que no sea necesario introducir el nombre completo.
    @Query("SELECT jdr FROM Jugador jdr WHERE jdr.name LIKE :name")
    List<Jugador> findJugadorByName(@Param("name") String name);

    //Buscar jugadores que hayan conseguido un número mayor o igual a un número de canastas especificado como parámetro.
    @Query("SELECT jdr FROM Jugador jdr WHERE jdr.n_canastas >= :canastas")
    List<Jugador> findByCanastas(@Param("canastas") int canastas);

    //Buscar jugadores que hayan efectuado un número de asistencias dentro de un rango especificado como parámetro.
    @Query("SELECT jdr FROM Jugador jdr WHERE jdr.n_asistencias >= :minim AND jdr.n_asistencias <= :maxim")
    List<Jugador> findJugadorListAsistenciasBetween(@Param("minim") int min, @Param("maxim") int max);

    //Buscar jugadores que pertenezcan a una posición específica, por ejemplo: base
    @Query("SELECT jdr FROM Jugador jdr WHERE jdr.posicion = :posicion")
    List<Jugador> findByPosicion(@Param("posicion") String posicion);

    //Buscar jugadores que hayan nacido en una fecha anterior a una fecha especificada como parámetro.
   // List<Jugador> findByFecha_nacimientoBefore(Date fecha);

    //Agrupar los jugadores por la posición del campo y devolver para cada grupo la siguiente información: la media de canastas, asistencias y rebotes.
    @Query("SELECT jdr.posicion,AVG(jdr.n_canastas),AVG(jdr.n_asistencias),AVG(jdr.n_rebotes) FROM Jugador jdr GROUP BY jdr.posicion")
    List<Jugador> findByPosicionMedia();

    //Lo mismo que el punto anterior pero devolviendo la media, el máximo y el mínimo de canastas, asistencias y rebotes.
    @Query("SELECT jdr.posicion,AVG(jdr.n_canastas),MIN(jdr.n_canastas),MAX(jdr.n_canastas),AVG(jdr.n_asistencias),MIN(jdr.n_asistencias),MAX(jdr.n_asistencias),AVG(jdr.n_rebotes),MIN(jdr.n_rebotes),MAX(jdr.n_rebotes) FROM Jugador jdr GROUP BY jdr.posicion")
    List<Jugador> findByPosicionAvgMinMax();
}
