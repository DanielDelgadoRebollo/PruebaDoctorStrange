package com.example.doctorstrange.BBDD;

import com.mongodb.Block;
import com.mongodb.ConnectionString;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.squareup.okhttp.*;

public class BaseDeDatos {


    public MongoDatabase conexion() {
        MongoClient client = MongoClients.create("mongodb+srv://testUser:12345@doctorstrange.wc8mn.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoDatabase db = client.getDatabase("DoctorStrange");
        //MongoCollection col = db.getCollection("Usuario");
        return db;

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
        for (Document item:iterable) {
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
