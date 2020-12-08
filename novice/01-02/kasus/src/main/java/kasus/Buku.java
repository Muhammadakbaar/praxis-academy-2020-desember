package kasus;

public class Buku {

    String id, judul, pengarang;

    public Buku (String id_buku, String judul_buku, String pengarang_buku ) {
        this.id = id_buku;
        this.judul = judul_buku;
        this.pengarang = pengarang_buku;
    }

    public String setIdBuku(String id_baru) {
        id = id_baru;
        return id;
    }

    public String getIdBuku() {
        return id;
    }

    public String setJudulBuku(String judul_baru) {
        judul = judul_baru;
        return judul;
    }

    public String getJudulBuku() {
        return judul;
    }

    public String setPengarangBuku(String pengarang_baru) {
        pengarang = pengarang_baru;
        return pengarang;
    }

    public String getPengarangBuku() {
        return pengarang;
    }
}