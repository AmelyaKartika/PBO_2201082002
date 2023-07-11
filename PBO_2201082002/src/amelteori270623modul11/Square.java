/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amelteori270623modul11;

/**
 *
 * @author hp
 */
public class Square extends Shape {
 private int s;
 private double area;
 
 public int getS(){
     return s;
 }
 public void setS(int s){
       this.s=s;
   }
  
    
    public String getName(){
        return "Persegi";
    }
   
   
    public double getArea(){
        area = s*s;
        return area;
    }
    }

