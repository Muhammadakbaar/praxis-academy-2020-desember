package latihan.mongodb;

import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

public class ConnectToMongoDB {

    public static void main(String[] args) {

        //membuat mongo client
        MongoClient mongo = new MongoClient("localhost", 27017);

        // membuat credential
        MongoCredential credential;
        credential = MongoCredential.createCredential("", "myDb", "".toCharArray());

        System.out.println("Connected to the database successfully");

        // Mengakses database
        MongoDatabase database = mongo.getDatabase("myDb");
        System.out.println("Credentials ::"+credential);

    }
}