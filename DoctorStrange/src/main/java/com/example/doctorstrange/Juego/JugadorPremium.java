package com.example.doctorstrange.Juego;

import java.util.Date;

public class JugadorPremium extends Jugador {
    public JugadorPremium(int id, String user, String password, String name, String email, Date fechaAlta, boolean estado) {
        super(user, password, name, email, fechaAlta, estado);
    }
}
