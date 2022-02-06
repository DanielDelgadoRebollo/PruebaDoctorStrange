package com.example.doctorstrange.Juego;

import java.util.Date;

public class Jugador {

    int id = 0;
    String user, password, name, email;
    Date fechaAlta;
    boolean estado;


    public Jugador(String user, String password, String name, String email, Date fechaAlta, boolean estado) {
        this.id = this.id++;
        this.user = user;
        this.password = password;
        this.name = name;
        this.email = email;
        this.fechaAlta = fechaAlta;
        this.estado = estado;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
