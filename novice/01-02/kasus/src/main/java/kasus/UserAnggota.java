package kasus;

public class UserAnggota extends User implements BisaPinjam{

    String nama, alamat;
    public UserAnggota(String username, String password, String nama_anggota, String alamat_anggota) {
        super(username, password);
        nama = nama_anggota;
        alamat = alamat_anggota;
    }

    public String setNamaAnggota(String nama_baru) {
        nama = nama_baru;
        return nama;
    }

    public String getNamaAnggota() {
        return nama;
    }

    public String setAlamatAnggota(String alamat_baru) {
        alamat = alamat_baru;
        return alamat;
    }

    public String getAlamataAnggota() {
        return alamat;
    }

    @Override
    public void pinjam() {
        System.out.println("Anda bisa pinjam buku");
    }
}