package com.example.service;


import com.example.model.Jugador;
import com.example.repository.EquipoRepository;
import com.example.repository.JugadorRepository;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Albert on 07/11/2016.
 */
@Service
public class JugadorService {

    //@Autowired
    private JugadorRepository jugadorRepository;

    //@Autowired
    private EquipoRepository equipoRepository;

    public static void dar_alta_5_jugadores(){
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(1990, Calendar.JUNE, 12);
        Jugador j1 = new Jugador(1, "Jaume", calendar.getTime(), 15, 50, 73, "pivot", null);
        calendar.set(1989, Calendar.JANUARY, 22);
        Jugador j2 = new Jugador(2, "Franki", calendar.getTime(), 70, 34, 10, "base", null);
        calendar.set(1988, Calendar.JUNE, 11);
        Jugador j3 = new Jugador(3, "Jeffren", calendar.getTime(), 33, 22, 3, "escolta", null);
        calendar.set(1994, Calendar.NOVEMBER, 1);
        Jugador j4 = new Jugador(4, "Marc", calendar.getTime(), 59, 11, 23, "ala-pivot", null);
        calendar.set(1991, Calendar.SEPTEMBER, 3);
        Jugador j5 = new Jugador(5, "Ignasi", calendar.getTime(), 24, 79, 58, "aler", null);
    }

}
