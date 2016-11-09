package com.example.service;


import com.example.model.Jugador;

/**
 * Created by Albert on 07/11/2016.
 */
public class jugadorService {

    public static void dar_alta_5_jugadores(){
        Jugador j1 = new Jugador(1, "Jaume", "12/07/1990", 15, 50, 73, "pivot");
        Jugador j2 = new Jugador(2, "Franki", "22/01/1989", 70, 34, 10, "base");
        Jugador j3 = new Jugador(3, "Jeffren", "11/07/1988", 33, 22, 3, "escolta");
        Jugador j4 = new Jugador(4, "Marc", "01/11/1994", 59, 11, 23, "ala-pivot");
        Jugador j5 = new Jugador(5, "Ignasi", "03/09/1991", 24, 79, 58, "aler");
    }

}
