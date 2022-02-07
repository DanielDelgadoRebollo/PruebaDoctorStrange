package com.example.doctorstrange.Juego;

import com.example.doctorstrange.BBDD.BaseDeDatos;

import java.util.Scanner;

public class Partida {
    public static void main(String[] args) {
        BaseDeDatos baseDeDatos = new BaseDeDatos();
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        String user,password,nombre,apellidos,localizacion,edad,email,fechaAlta,sexo,tarjetaBancaria,trabajo,nacionalidad;
        System.out.println("Bienvenidos a doctor Strange");
        do {
            System.out.println("Opcion 1 para identificarte");
            System.out.println("Opcion 2 para registrarte");
            System.out.println("Opcion 3 para salir");
            switch (num){
                case 1:
                    System.out.println("Identifiquese");
                    System.out.println("Introduzca Usuario");
                    user = teclado.next();
                    System.out.println("Introduzca password");
                    password = teclado.next();
                    baseDeDatos.conexion();
                    if (baseDeDatos.comprobarUsuario(user,password)){

                    }else{
                        System.out.println("Para poder jugar, debes registrarte");

                    }
                    break;
                case 2:
                    System.out.println("Registrese");
                    System.out.println("Introduzca nombre de usuario");
                    user = teclado.next();
                    System.out.println("Introduzca contraseña");
                    password = teclado.next();
                    System.out.println("Introduzca nombre");
                    nombre = teclado.next();
                    System.out.println("Introduzca apellidos");
                    apellidos = teclado.next();
                    System.out.println("Introduzca localizacion");
                    localizacion = teclado.next();
                    System.out.println("Introduzca edad");
                    edad = teclado.next();
                    System.out.println("Introduzca email");
                    email = teclado.next();
                    System.out.println("Introduzca si tiene tarjeta bancaria");
                    System.out.println("Introduzca Nacionalidad");
                    baseDeDatos.registrarUser();
                    break;
                case 3:
                    break;
            }
        }while (num!=3);


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
