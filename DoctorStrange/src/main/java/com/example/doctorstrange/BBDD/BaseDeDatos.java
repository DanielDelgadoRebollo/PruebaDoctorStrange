package com.example.doctorstrange.BBDD;

import com.example.doctorstrange.Juego.Jugador;
import com.example.doctorstrange.Juego.Superheroes;
import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.squareup.okhttp.*;

import java.nio.charset.StandardCharsets;

public class BaseDeDatos implements BaseDeDatosUsuario, BaseDeDatosEscenarios, BaseDeDatosSuperheroes, BaseDeDatosRanking{

    public MongoDatabase conexion() {
        MongoClient client = MongoClients.create(DB_MONGO_DBURI);
        MongoDatabase db = client.getDatabase(DB_NAME);
        return db;
    }

    public void cerrarConexion() {
        try {
            MongoClient client = MongoClients.create(DB_MONGO_DBURI);
            MongoDatabase db = client.getDatabase(DB_NAME);
            client.close();
            System.out.println("Se ha cerrado la conexión con la base de datos");
        } catch (MongoException e) {
            e.printStackTrace();
            System.out.println("Error al cerrar la conexión con la base de datos");
        }
    }

    public boolean comprobarUsuario(String usuario, String password) {
        MongoDatabase db = conexion();
        FindIterable<Document> findDocument = db.getCollection(DB_COL_USER).find();

        for (Document item : findDocument) {
            if (item.getString(DB_ATRIB_USERNAME).equals(usuario) && item.getString(DB_ATRIB_PASS).equals(password)) {
                System.out.println("Login correcto. Bienvenido: " + item.getString("Usuario"));
                return true;
            } else {
                System.out.println("Login incorrecto.");

            }

        }
        return false;
    }
    public void elegirEscenario(){
        MongoDatabase db = conexion();
        FindIterable<Document> findDocument = db.getCollection(DB_COL_SCENE).find();
        System.out.println("Elige un escenario");
        System.out.println("-----------------------------");
        for (Document item : findDocument) {
            System.out.println(item.getString("Escenario"));
        }
    }

   public void elegirSuperheroes(){
        MongoDatabase db = conexion();
        FindIterable<Document> findDocument = db.getCollection(DB_COL_SUPERHEROES).find();
        String nombre = null;
       System.out.println("Elige tres superheroes para luchar");
       System.out.println("-----------------------------");
       for (Document item : findDocument) {
            System.out.println(item.getString("Nombre"));
            }
    }

    public Jugador cargarJugador() {
        MongoDatabase db = conexion();
        FindIterable<Document> findDocument = db.getCollection(DB_COL_USER).find();
        String user = null;
        int coins = 0;
        for (Document item : findDocument) {
            user = item.getString(DB_ATRIB_USERNAME);
            coins = item.getInteger(DB_ATRIB_MONEDAS);

        }
        Jugador jugador = new Jugador(coins, user);
        return jugador;
    }


    public boolean registrarUser(Jugador jugador) {


        return true;
    }

    public void guardarPartida() {
        conexion();

        /*  Document sampleDoc = new Document("ID", "2").append("Nombre", "Jonh Smith");
        Document sampleDoc1 = new Document("ID", "3").append("Nombre", "Was Smith");
        Document sampleDoc2 = new Document("ID", "4").append("Nombre", "Klk Smith");
        Document sampleDoc3 = new Document("ID", "5").append("Nombre", "A.K.A Smith");
        Document sampleDoc4 = new Document("ID", "6").append("Nombre", "Dani Smith");
        col.insertOne(sampleDoc);
        col.insertOne(sampleDoc1);
        col.insertOne(sampleDoc2);
        col.insertOne(sampleDoc3);
        col.insertOne(sampleDoc4);
        busqueda(col);

         */
    }

    public void cargarPartida() {
        MongoDatabase db = conexion();
        FindIterable<Document> iterable = db.getCollection("Usuario").find();
        for (Document item : iterable) {
            System.out.println(item);
        }
    }

    public String busqueda(MongoCollection col) {
        // Create the document to specify find criteria
        Document findDocument = new Document();

        // Document to store query results
        FindIterable<Document> resultDocument = col.find(findDocument);

        // Return the name of the first returned document
        System.out.println(resultDocument.first().toJson());
        return resultDocument.first().toJson();

    }


}
