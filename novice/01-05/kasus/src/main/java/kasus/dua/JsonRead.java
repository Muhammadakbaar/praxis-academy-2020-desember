// Java program to read JSON from a file 
package kasus.dua;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.util.Iterator; 
import java.util.Map; 

import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*; 

public class JsonRead { 
	public static void mulai() throws Exception 
	{ 
        try {
            // parsing file "JSONExample.json" 
		Object obj = new JSONParser().parse(new FileReader("contoh.json")); 
		
		// typecasting obj to JSONObject 
		JSONObject jo = (JSONObject) obj; 
		
        JSONArray booksArray = (JSONArray) jo.get("books");
        Iterator bookIterator = booksArray.iterator();
        
        System.out.println("..:: Books ::..");
        while (bookIterator.hasNext()) {
            System.out.println(bookIterator.next());
            
        }
        
        JSONArray anggotaArray = (JSONArray) jo.get("anggota");
        Iterator anggotaIterator = anggotaArray.iterator();
        System.out.println("..:: Anggota ::..");
        while (anggotaIterator.hasNext()) {
            System.out.println(anggotaIterator.next());
        }

        JSONArray staffArray = (JSONArray) jo.get("staff");
        Iterator staffIterator = staffArray.iterator();
        System.out.println("..:: Staff ::..");
        while (staffIterator.hasNext()) {
            System.out.println(staffIterator.next());
        }

        JSONArray peminjamanArray = (JSONArray) jo.get("peminjaman");
        Iterator peminjamanIterator = peminjamanArray.iterator();
        System.out.println("..:: Pemminjaman ::..");
        while (peminjamanIterator.hasNext()) {
            System.out.println(peminjamanIterator.next());
        }    
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	} 
} 
