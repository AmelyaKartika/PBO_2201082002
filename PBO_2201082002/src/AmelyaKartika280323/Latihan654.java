/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AmelyaKartika280323;
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class Latihan654 {
   public static void main(String[]args){
    //While Loop\\
 int i =1;
 int hasil =1;
 String str1="";
 String str2="";
 str1=JOptionPane.showInputDialog("Masukkan angka");
 int angka=Integer.valueOf(str1).intValue();
str2=JOptionPane.showInputDialog("Masukkanpangkat");
 int pangkat=Integer.valueOf(str2).intValue();
 while(i<=pangkat)
 {
    hasil=hasil*angka;
    i++;
 }
String str3= angka+" pangkat "+pangkat+ " = "+hasil;
JOptionPane.showMessageDialog(null, str3 );
 }   
 } 
