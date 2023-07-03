/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amelbuku.model;

/**
 *
 * @author hp
 */
public class Buku {
    private String kodeBuku;
    private String judulBuku;
    private String pengarang;
    private String penerbit;
    
    public Buku (){
    }
    
    public Buku (String kodeBuku, String judulBuku, String pengarang, String penerbit){
        this.kodeBuku = kodeBuku;
        this.judulBuku= judulBuku;
        this.pengarang = pengarang;
        this.penerbit= penerbit;   
    }
    public String getKodeBuku (){
        return kodeBuku;
    }
    
    public void setKodeBuku(String kodeBuku){
        this.kodeBuku = kodeBuku;
    }
     public String getJudulBuku (){
        return judulBuku;
    }
    
    public void setJudulBuku(String judulBuku){
        this.judulBuku = judulBuku;
    }
     public String getPengarang (){
        return pengarang;
    }
    
    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }
     public String getPenerbit (){
        return penerbit;
    }
    
    public void setPenerbit (String penerbit){
        this.penerbit = penerbit;
    }
}


