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
public class Latihan651JOptionPane {
    public static void main(String[]args){
  String a=" ";
  String b=" ";
  String c=" ";
  a=JOptionPane.showInputDialog("Masukkan nilai pertama Anda");
  int number1 = Integer.valueOf(a).intValue();
  b=JOptionPane.showInputDialog("Masukkan nilai kedua Anda");
  int number2 = Integer.valueOf(b).intValue();
  c=JOptionPane.showInputDialog("Masukkan nilai ketiga Anda");
  int number3 = Integer.valueOf(c).intValue();
  
 int Rata=(number1+number2+number3)/3;
  
  String hasil= " ";
  hasil = "Nilai pertama: " +number1 +"\n";
  hasil = "Nilai kedua: " +number2 +"\n";
  hasil = "Nilai ketiga: " +number3 +"\n";
  hasil = "Rata-rata nilai Anda adalah " +Rata+"\n";
   
   if (Rata<=60){
   hasil +=":-("+"\n";
  }
  else {hasil +=":-)"+"\n";
  }
  JOptionPane.showMessageDialog(null, hasil); 
  
    }
}
