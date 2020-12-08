package kasus.dua;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class XmlDomRead {
    public static void mulai() {
        try {
            File inputFile = new File("perpustakaan.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("books");
            System.out.println("----------------------------");
            
            for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Books id : " 
                        + eElement.getAttribute("id"));
                    System.out.println("Judul : " 
                        + eElement
                        .getElementsByTagName("judul")
                        .item(0)
                        .getTextContent());
                    System.out.println("Pengarang : " 
                        + eElement
                        .getElementsByTagName("pengarang")
                        .item(0)
                        .getTextContent());
                }
            }

            nList = doc.getElementsByTagName("anggota");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element : "
                    +nNode.getNodeName());
                
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Anggota id : " 
                        + eElement.getAttribute("id"));
                    System.out.println("Nama : " 
                        + eElement
                        .getElementsByTagName("nama")
                        .item(0)
                        .getTextContent());
                    System.out.println("Alamat : " 
                        + eElement
                        .getElementsByTagName("alamat")
                        .item(0)
                        .getTextContent());
                    }
            }

            nList = doc.getElementsByTagName("staff");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element : "
                    +nNode.getNodeName());
                
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                System.out.println("Staff id : " 
                    + eElement.getAttribute("id"));
                System.out.println("Nama : " 
                    + eElement
                    .getElementsByTagName("nama")
                    .item(0)
                    .getTextContent());
                System.out.println("Alamat : " 
                    + eElement
                    .getElementsByTagName("alamat")
                    .item(0)
                    .getTextContent());
                }
            }
            
            nList = doc.getElementsByTagName("peminjaman");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element : "
                    +nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Peminjaman id : "
                        + eElement.getAttribute("id"));
                    System.out.println("Id Anggota : "
                        + eElement.getElementsByTagName("id_anggota")
                        .item(0).getTextContent());
                    System.out.println("Id Buku : "
                        + eElement.getElementsByTagName("id_buku")
                        .item(0).getTextContent());
                    System.out.println("Tanggal pinjam : "
                        + eElement.getElementsByTagName("tanggal_pinjam")
                        .item(0).getTextContent());
                    System.out.println("Tanggal kembali : "
                        + eElement.getElementsByTagName("tanggal_kembali")
                        .item(0).getTextContent());
                    System.out.println("Sudah kembali : "
                        + eElement.getElementsByTagName("sudah_kembali")
                        .item(0).getTextContent());
                    }
            }         
      } catch (Exception e) {
         e.printStackTrace();
      } 
      
   }
}