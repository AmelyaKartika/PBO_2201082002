/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AmelyaKartika160523;

/**
 *
 * @author hp
 */
public class BukuAlamatData {
    private BukuAlamat data[] = new BukuAlamat[100];
    private int index;
   
    /**
     *
     */
    
    
    public void insert(BukuAlamat bukuAlamat){
        data[index] = bukuAlamat;
        index++;
    }
    public void update(int index, BukuAlamat bukuAlamat){
        
        data[index] =bukuAlamat;
    }
    public void delete(int index){
        
        data[index] =null;
    }
     public BukuAlamat[] getData() {
         return data;
    }    
    
         
     }



