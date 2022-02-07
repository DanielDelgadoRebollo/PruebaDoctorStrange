package com.example.doctorstrange.Juego;

import com.example.doctorstrange.BBDD.BaseDeDatos;

import java.util.Scanner;

public class Partida {
    public static void main(String[] args) {
        BaseDeDatos baseDeDatos = new BaseDeDatos();
        System.out.println("Bienvenidos a doctor Strange");
        System.out.println("Identifiquese");
        String user,password;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca Usuario");
        user = teclado.next();
        System.out.println("Introduzca password");
        password = teclado.next();
        baseDeDatos.conexion();
        if (baseDeDatos.comprobarUsuario(user,password)){

        }


    }
    //TODO
    /*Cada jugador posee un número de monedas que va ganando a lo largo del juego y que
utiliza para configurar y mejorar su equipo.

La partida no podrá comenzar hasta que ambos equipos contengan el número de superhéroes
establecido por el escenario.
La partida no podrá comenzar hasta que cada superhéroe tenga configurado el número de
movimientos establecidos por el escenario.
Cada superhéroe cuenta con una energía vital y un conjunto de movimientos que utilizará
en la lucha.
Además, cada superhéroe posee un conjunto de características (power grid) que se asocian
a sus poderes. Estas características permitirán modular los distintos movimientos de ataque
o defensa que puede realizar dentro de la lucha.
Las características de cada superhéroe pueden ser mejoradas por el jugador al inicio de la
partida.
     */


}
