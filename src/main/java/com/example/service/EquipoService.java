package com.example.service;

import com.example.model.Equipo;
import com.example.model.Jugador;
import com.example.repository.EquipoRepository;
import com.example.repository.JugadorRepository;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 * Created by apellegero on 10/11/2016.
 */
@Service
public class EquipoService {

    //@Autowired
    private JugadorRepository jugadorRepository;

    //@Autowired
    private EquipoRepository equipoRepository;

    //1. Dar de alta cinco equipos con cinco jugadores.
    public static void alta_cinc_equips() {
        Calendar calendar = GregorianCalendar.getInstance();

        //Equipo 1
        calendar.set(1990, Calendar.JUNE, 12);
        Equipo e1 = new Equipo(1, "raptors", "toronto", calendar.getTime());
        calendar.set(1990, Calendar.JUNE, 12);
        new Jugador(1, "Jaume", calendar.getTime(), 15, 50, 73, "pivot", e1);
        calendar.set(1989, Calendar.JANUARY, 22);
        new Jugador(2, "Franki", calendar.getTime(), 70, 34, 10, "base", e1);
        calendar.set(1988, Calendar.JUNE, 11);
        new Jugador(3, "Jeffren", calendar.getTime(), 33, 22, 3, "escolta", e1);
        calendar.set(1994, Calendar.NOVEMBER, 1);
        new Jugador(4, "Marc", calendar.getTime(), 59, 11, 23, "ala-pivot", e1);
        calendar.set(1991, Calendar.SEPTEMBER, 3);
        new Jugador(5, "Ignasi", calendar.getTime(), 24, 79, 58, "aler", e1);

        //Equipo 2
        calendar.set(1910, Calendar.JUNE, 12);
        Equipo e2 = new Equipo(2, "Spurs", "Sant Antonio", calendar.getTime());
        calendar.set(1990, Calendar.JUNE, 12);
        new Jugador(6, "Jaume", calendar.getTime(), 33, 51, 73, "pivot", e2);
        calendar.set(1989, Calendar.JANUARY, 22);
        new Jugador(7, "Franki", calendar.getTime(), 70, 34, 10, "base", e2);
        calendar.set(1988, Calendar.JUNE, 11);
        new Jugador(8, "Jeffren", calendar.getTime(), 33, 22, 3, "escolta", e2);
        calendar.set(1994, Calendar.NOVEMBER, 1);
        new Jugador(9, "Marc", calendar.getTime(), 59, 11, 23, "ala-pivot", e2);
        calendar.set(1991, Calendar.SEPTEMBER, 3);
        new Jugador(10, "Ignasi", calendar.getTime(), 24, 79, 58, "aler", e2);

        //Equipo 3
        calendar.set(1990, Calendar.JUNE, 12);
        Equipo e3 = new Equipo(3, "Lakers", "Los Angeles", calendar.getTime());
        calendar.set(1990, Calendar.JUNE, 12);
        new Jugador(11, "Jaume", calendar.getTime(), 15, 50, 73, "pivot", e3);
        calendar.set(1989, Calendar.JANUARY, 22);
        new Jugador(12, "Franki", calendar.getTime(), 70, 34, 10, "base", e3);
        calendar.set(1988, Calendar.JUNE, 11);
        new Jugador(13, "Jeffren", calendar.getTime(), 33, 22, 3, "escolta", e3);
        calendar.set(1994, Calendar.NOVEMBER, 1);
        new Jugador(14, "Marc", calendar.getTime(), 59, 11, 23, "ala-pivot", e3);
        calendar.set(1991, Calendar.SEPTEMBER, 3);
        new Jugador(15, "Ignasi", calendar.getTime(), 24, 79, 58, "aler", e3);

        //Equipo 4
        calendar.set(1990, Calendar.JUNE, 12);
        Equipo e4 = new Equipo(4, "Bulls", "Chicago", calendar.getTime());
        calendar.set(1990, Calendar.JUNE, 12);
        new Jugador(16, "Jaume", calendar.getTime(), 15, 50, 73, "pivot", e4);
        calendar.set(1989, Calendar.JANUARY, 22);
        new Jugador(17, "Franki", calendar.getTime(), 70, 34, 10, "base", e4);
        calendar.set(1988, Calendar.JUNE, 11);
        new Jugador(18, "Jeffren", calendar.getTime(), 33, 22, 3, "escolta", e4);
        calendar.set(1994, Calendar.NOVEMBER, 1);
        new Jugador(19, "Marc", calendar.getTime(), 59, 11, 23, "ala-pivot", e4);
        calendar.set(1991, Calendar.SEPTEMBER, 3);
        new Jugador(20, "Ignasi", calendar.getTime(), 24, 79, 58, "aler", e4);

        //Equipo 1
        calendar.set(1990, Calendar.JUNE, 12);
        Equipo e5 = new Equipo(5, "Hanoseque", "Atlanta", calendar.getTime());
        calendar.set(1990, Calendar.JUNE, 12);
        new Jugador(21, "Jaume", calendar.getTime(), 15, 50, 73, "pivot", e5);
        calendar.set(1989, Calendar.JANUARY, 22);
        new Jugador(22, "Franki", calendar.getTime(), 70, 34, 10, "base", e5);
        calendar.set(1988, Calendar.JUNE, 11);
        new Jugador(23, "Jeffren", calendar.getTime(), 33, 22, 3, "escolta", e5);
        calendar.set(1994, Calendar.NOVEMBER, 1);
        new Jugador(24, "Marc", calendar.getTime(), 59, 11, 23, "ala-pivot", e5);
        calendar.set(1991, Calendar.SEPTEMBER, 3);
        new Jugador(25, "Ignasi", calendar.getTime(), 24, 79, 58, "aler", e5);
    }
}
