package com.example.doctorstrange.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControladorJugar {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}