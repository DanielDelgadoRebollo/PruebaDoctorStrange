package com.example.doctorstrange.Juego;

import com.example.doctorstrange.BBDD.BaseDeDatos;
import com.mongodb.client.FindIterable;
import org.bson.Document;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Partida {
    public static void main(String[] args) {
        String user, password;
        int opcionUsuario = 0;
        Scanner teclado = new Scanner(System.in);
        BaseDeDatos baseDeDatos = new BaseDeDatos();
        baseDeDatos.conexion();
            try {
                do {
                    System.out.println("1.- Jugar Partida");
                    System.out.println("2.- Cargar Partida");
                    System.out.println("3.- Salir");
                opcionUsuario = teclado.nextInt();
                if (opcionUsuario == 1 || opcionUsuario == 2 || opcionUsuario == 3) {
                    switch (opcionUsuario) {
                        case 1:
                            System.out.println("Bienvenidos a doctor Strange");
                            System.out.println("Identifiquese");
                            System.out.println("Introduzca Usuario");
                            user = teclado.next();
                            System.out.println("Introduzca password");
                            password = teclado.next();
                            baseDeDatos.conexion();
                            if (baseDeDatos.comprobarUsuario(user, password)) {
                                Jugador jugador = baseDeDatos.cargarJugador();
                                System.out.println(jugador.user + "\n" + jugador.monedas);
                            } else {
                                System.out.println("Los datos introducidos son incorrectos, vuelve a intentarlo");
                            }
                            break;
                        case 2:
                            break;
                    }
                } else {
                    System.out.println("Numero mal introducido");
                }
                }while(opcionUsuario != 3);
            } catch (InputMismatchException ex) {
                System.out.println("Debe ingresar obligatoriamente un número entre 1 y 3.");
            }

            baseDeDatos.cerrarConexion();
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
