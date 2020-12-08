package latihan.mongodb;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

public class InsertingDocument {

    public static void main(String[] args) {

        //create mongo client
        MongoClient mongo = new MongoClient("localhost", 27017);

        //create credentials
        MongoCredential credential;
        credential = MongoCredential.createCredential("", "myDb", "".toCharArray());
        System.out.println("Konek ke database berhasil");

        //access database
        MongoDatabase database = mongo.getDatabase("myDb");

        //mengambil collection
        MongoCollection<Document> collection = database.getCollection("sampleCollection");
        System.out.println("Collection sampleCollection berhasil dipilih");

        Document document = new Document("title", "MongoDB")
        .append("id", 1)
        .append("description", "database")
        .append("likes", 100)
        .append("url", "http://www.tutorialspoint.com/mongodb/")
        .append("by", "tutorials point");
        collection.insertOne(document);
        System.out.println("Document berhasil dimasukkan");

    }
}