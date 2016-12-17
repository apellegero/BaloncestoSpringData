package com.example.repository;
import com.example.model.Equipo;
import com.example.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apellegero on 10/11/2016.
 */
@Repository
public interface EquipoRepository extends JpaRepository<Equipo,Long> {
    //Consulta los equipos existentes en una localidad determinada.
    List<Equipo> findEquipoByLocalidad(String localidad);

    //Devuelve todos los jugadores de un equipo, a partir del nombre completo del equipo.
    @Query("SELECT jdr from Jugador jdr, Equipo e WHERE e.id=jdr.equipo and e.nombre = :nombreEquipo")
    List<Jugador> findJugadorByEquipoNombre(@Param("nombreEquipo") String nombre);

    //Devuelve todos los jugadores de un equipo, que además jueguen en la misma posición (parámetro adicional de la consulta), por ejemplo, alero.
    @Query("select jdr from Jugador jdr, Equipo e where e.id = jdr.equipo and e.nombre = :nombreEquipo and jdr.posicion = :posicion")
    List<Jugador> findJugadorByEquipoNombreAndPosicion(@Param("nombreEquipo") String nombre, @Param("posicion") String posicion);

    //Devuelve el jugador que más canastas ha realizado de un equipo determinado como parámetro.
    @Query("select jdr from Jugador jdr, Equipo e where e.id = jdr.equipo and e.nombre = :nombreEquipo order by jdr.n_canastas desc")
    List<Jugador> findMaxCanastasByEquipo(@Param("nombreEquipo") String nombre);
}
