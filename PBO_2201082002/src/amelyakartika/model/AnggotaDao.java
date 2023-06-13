/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amelyakartika.model;
import java.util.*;
/**
 *
 * @author hp
 */
public class AnggotaDao {
   private List<Anggota> data = new ArrayList();
    
    public AnggotaDao(){
        data.add(new Anggota ("112","Kevin","Padang","L"));
        data.add(new Anggota ("113","Amelya","Padang","p"));
        
    }
    
    public void insert(Anggota anggota){
        data.add(anggota);
    }
    public void update(int index, Anggota anggota){
        data.set(index, anggota);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Anggota getAnggota(int index){
        return data.get(index);
    }
    
    public List<Anggota>getAll(){
        return data;
    }
}
