package latihan.mongodb;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

public class CreatingCollection {

    public static void main(String[] args) {

        // membuat mongo client
        MongoClient mongo = new MongoClient("localhost", 27017);
        
        //membuat credentials
        MongoCredential credential;
        credential = MongoCredential.createCredential("", "myDb", "".toCharArray());
        System.out.println("Connected to the database successfully");
        
        //mengakses database
        MongoDatabase database = mongo.getDatabase("myDb");

        //membuat collection
        database.createCollection("cobaCollection");

        //get collection
        MongoCollection<Document> collection = database.getCollection("myCollection: ");
        System.out.println("Collection myCollection selected successfully");
    }
}