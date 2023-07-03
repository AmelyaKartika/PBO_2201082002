/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amelpeminjaman.model;

/**
 *
 * @author hp
 */
public class Peminjaman {
    private String kodeAnggota;
    private String kodeBuku;
    private String tanggalPinjam;
    private String tanggalKembali;
    
    public Peminjaman() {
    }
    
    public Peminjaman(String kodeAnggota, String kodeBuku, String tanggalPinjam, String tanggalKembali) {
        this.kodeAnggota = kodeAnggota;
        this.kodeBuku = kodeBuku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }
    
    public String getKodeAnggota() {
        return kodeAnggota;
    }
    
    public void setKodeAnggota(String kodeAnggota) {
        this.kodeAnggota = kodeAnggota;
    }
    
    public String getKodeBuku() {
        return kodeBuku;
    }
    
    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }
    
    public String getTanggalPinjam() {
        return tanggalPinjam;
    }
    
    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }
    
    public String getTanggalKembali() {
        return tanggalKembali;
    }
    
    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

}
