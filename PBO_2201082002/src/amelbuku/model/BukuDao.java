/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amelbuku.model;
import java.util.*;

/**
 *
 * @author hp
 */
public class BukuDao {
   private List<Buku> data = new ArrayList();
    
    public BukuDao(){
        data.add(new Buku ("25A","Matematika","Amelya Kartika","Dwi"));
        data.add(new Buku ("25B","PPKN","Suci","Oliv"));
        
    }
    
    public void insert(Buku buku){
        data.add(buku);
    }
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    public List<Buku>getAll(){
        return data;
    }
}
  
