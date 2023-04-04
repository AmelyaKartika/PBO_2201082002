/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AmelyaKartika280323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author hp
 */
public class Latihan651 {
   public static void main(String[]args){
       //Menggunakan Buffered Reader\\
       BufferedReader nilai = new BufferedReader(new InputStreamReader(System.in));
       String a=" ";
       String b=" ";
       String c=" ";
       try{
           System.out.println("Masukkan Nilai Pertama = ");
           a =nilai.readLine();
           System.out.println("Masukkan Nilai Pertama = ");
           b =nilai.readLine();
           System.out.println("Masukkan Nilai Pertama = ");
           c =nilai.readLine();
       }catch(IOException e){
           System.out.println("Error!!");}
         int number1;
         int number2;
         int number3;
         number1 = Integer.parseInt(a);
         number2 = Integer.parseInt(b);
         number3 = Integer.parseInt(c);
         
         int Rata=(number1+number2+number3)/3;
         System.out.println("Rata-Rata nilai Anda = " +Rata);
         if(Rata<=60){
             System.out.println(":-(");
         }else {
             System.out.println(":-)");
         }
         
           
   }
    
}
