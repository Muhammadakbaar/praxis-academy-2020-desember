
package kasus.satu;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

class Peminjaman {
    private String id, id_anggota, id_buku, tanggal_pinjam, tanggal_kembali;
    private String sudah_kembali;
    private int jumlah;
    private static Integer jumlahPeminjaman = 0;
    public Peminjaman(String id_peminjaman, String id_anggota, String id_buku, String tanggal_pinjam, String tanggal_kembali, String sudah_kembali) {
        this.id = id_peminjaman;
        this.id_anggota = id_anggota;
        this.id_buku = id_buku;
        this.tanggal_pinjam = tanggal_pinjam;
        this.tanggal_kembali = tanggal_kembali;
        this.sudah_kembali = sudah_kembali;
        this.jumlah = ++jumlahPeminjaman;
    }

    public String getId() {
        return id;
    }
    public String getIdAnggota() {
        return id_anggota;
    }
    public String getIdBuku() {
        return id_buku;
    }
    public String getTanggalPinjam() {
        return tanggal_pinjam;
    }
    public String getTanggalKembali() {
        return tanggal_kembali;
    }
    public String getSudahKembali() {
        return sudah_kembali;
    }
}

class Staff {
    private String id, nama, alamat;
    private int jumlah;
    private static Integer jumlahStaff = 0;
    public Staff(String id_staff, String nama_staff, String alamat_staff) {
        this.id = id_staff;
        this.nama = nama_staff;
        this.alamat = alamat_staff;
        this.jumlah = ++jumlahStaff;
    }

    public String getId() {
        return id;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public static int getJumlahAnggota(){
        return jumlahStaff;
    }
}

class Anggota {
    private String id, nama, alamat;
    private int jumlah;
    private static Integer jumlahAnggota = 0;
    public Anggota(String id_anggota, String nama_anggota, String alamat_anggota) {
        this.id = id_anggota;
        this.nama = nama_anggota;
        this.alamat = alamat_anggota;
        this.jumlah = ++jumlahAnggota;
    }

    public String getId() {
        return id;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public static int getJumlahAnggota(){
        return jumlahAnggota;
    }
}

class Books {
    
    private String id, judul, pengarang;
    private int jumlah;
    private static Integer jumlahBuku = 0;
    public Books(String book_id, String judul, String pengarang) {
        id = book_id;
        this.judul = judul;
        this.pengarang = pengarang;
        jumlah = ++jumlahBuku;
    }

    public String getId() {
        return id;
    }
    public String getJudul() {
        return judul;
    }
    public String getPengarang() {
        return pengarang;
    }
    public static int getJumlahBuku(){
        return jumlahBuku;
    }

}
public class XmlGenerator {       
 
    public static void mulai() {
        ArrayList <Books> bookAL = new ArrayList<>();
        bookAL.add(new Books("1", "Belajar Java", "Praxis academy")); 
        bookAL.add(new Books("2", "Belajar python", "Praxis academy"));
        bookAL.add(new Books("3", "Belajar masak", "Gordon Ramsey"));

        ArrayList <Anggota> anggotaAL = new ArrayList<>();
        anggotaAL.add(new Anggota("1", "Lazuardi Akbar", "Balapulang")); 
        anggotaAL.add(new Anggota("2", "Orang ke-2", "Bumi"));

        ArrayList <Staff> staffAL = new ArrayList<>();
        staffAL.add(new Staff("123", "Bamnomo", "Jupiter")); 
        staffAL.add(new Staff("222", "Vladimir Putin", "Russia"));
        staffAL.add(new Staff("333", "Natasha Romanoff", "Rahasia"));

        ArrayList <Peminjaman> peminjamanAL = new ArrayList<>();
        peminjamanAL.add(new Peminjaman("1", "1", "1", "30-01-2019", "05-02-2019", "sudah")); 
        peminjamanAL.add(new Peminjaman("2", "2", "3", "12-02-2019", "15-02-2019", "belum"));
        
    try { 
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();
        doc.setXmlStandalone(true);
        Element rootElement = doc.createElement("perpustakaan");
        doc.appendChild(rootElement);
        for(Books i : bookAL) {
            Element booksElement = doc.createElement("books");
            booksElement.setAttribute("id", ""+i.getId());
            rootElement.appendChild(booksElement);
            
            Element judulElement = doc.createElement("judul");
            judulElement.setTextContent(i.getJudul());
            booksElement.appendChild(judulElement);
            
            Element pengarangElement = doc.createElement("pengarang");
            pengarangElement.setTextContent(i.getPengarang());
            booksElement.appendChild(pengarangElement);
            
        }
        
        for(Anggota i : anggotaAL) {
            Element anggotaElement = doc.createElement("anggota");
            anggotaElement.setAttribute("id", ""+i.getId());
            rootElement.appendChild(anggotaElement);
            
            Element namaElement = doc.createElement("nama");
            namaElement.setTextContent(i.getNama());
            anggotaElement.appendChild(namaElement);
            
            Element alamatElement = doc.createElement("alamat");
            alamatElement.setTextContent(i.getAlamat());
            anggotaElement.appendChild(alamatElement);
            
        }
        
        for(Staff i : staffAL) {
            Element staffElement = doc.createElement("staff");
            staffElement.setAttribute("id", ""+i.getId());
            rootElement.appendChild(staffElement);
            
            Element namaElement = doc.createElement("nama");
            namaElement.setTextContent(i.getNama());
            staffElement.appendChild(namaElement);
            
            Element alamatElement = doc.createElement("alamat");
            alamatElement.setTextContent(i.getAlamat());
            staffElement.appendChild(alamatElement);
            
        }

        for(Peminjaman i : peminjamanAL) {
            Element peminjamanElement = doc.createElement("peminjaman");
            peminjamanElement.setAttribute("id", ""+i.getId());
            rootElement.appendChild(peminjamanElement);
            
            Element idAnggotaElement = doc.createElement("id_anggota");
            idAnggotaElement.setTextContent(i.getIdAnggota());
            peminjamanElement.appendChild(idAnggotaElement);
            
            Element idBukuElement = doc.createElement("id_buku");
            idBukuElement.setTextContent(i.getIdBuku());
            peminjamanElement.appendChild(idBukuElement);

            Element tanggalPinjamElement = doc.createElement("tanggal_pinjam");
            tanggalPinjamElement.setTextContent(i.getTanggalPinjam());
            peminjamanElement.appendChild(tanggalPinjamElement);

            Element tanggalKembaliElement = doc.createElement("tanggal_kembali");
            tanggalKembaliElement.setTextContent(i.getTanggalKembali());
            peminjamanElement.appendChild(tanggalKembaliElement);

            Element sudahKembaliElement = doc.createElement("sudah_kembali");
            sudahKembaliElement.setTextContent(i.getSudahKembali());
            peminjamanElement.appendChild(sudahKembaliElement);
            
        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource dom = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("perpustakaan.xml"));
        transformer.transform(dom, result);
        System.out.println("File perpustakaan was created.");
    } catch(Exception e ){ System.out.println(e.getMessage()); }

   }

}