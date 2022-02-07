module com.example.doctorstrange {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires org.mongodb.driver.sync.client;
    requires org.mongodb.bson;
    requires org.mongodb.driver.core;
    requires java.logging;
    requires okhttp;

    opens com.example.doctorstrange to javafx.fxml;
    exports com.example.doctorstrange;
    exports com.example.doctorstrange.Controller;
    opens com.example.doctorstrange.Controller to javafx.fxml;
    exports com.example.doctorstrange.Juego;
    opens com.example.doctorstrange.Juego to javafx.fxml;
}