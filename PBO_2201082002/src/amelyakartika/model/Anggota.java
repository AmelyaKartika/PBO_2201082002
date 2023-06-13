/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amelyakartika.model;

/**
 *
 * @author hp
 */
public class Anggota {
    private String kodeAnggota;
    private String namaAnggota;
    private String alamat;
    private String jenisKelamin;
    
    public Anggota (){
    }
    
    public Anggota (String kodeAnggota, String namaAnggota, String alamat, String jenisKelamin){
        this.kodeAnggota = kodeAnggota;
        this.namaAnggota = namaAnggota;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;   
    }
    public String getKodeAnggota (){
        return kodeAnggota;
    }
    
    public void setKodeAnggota (String kodeAnggota){
        this.kodeAnggota = kodeAnggota;
    }
     public String getNamaAnggota (){
        return namaAnggota;
    }
    
    public void setNamaAnggota (String namaAnggota){
        this.namaAnggota = namaAnggota;
    }
     public String getAlamat (){
        return alamat;
    }
    
    public void setAlamat (String alamat){
        this.alamat = alamat;
    }
     public String getJenisKelamin (){
        return jenisKelamin;
    }
    
    public void setJenisKelamin (String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
}
