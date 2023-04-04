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
public class Latihan652Switch {
    public static void main(String[]args){
        //Statement Switch\\
String h = JOptionPane.showInputDialog("Masukkan sebuah angka antara 1-10 : ");

int j = Integer.parseInt(h);

String huruf = "";

switch (j)

{

case 1:huruf = "Satu";

break;

case 2:huruf = "Dua";

break;

case 3:huruf ="Tiga";

break;

case 4:huruf ="Empat";

break;

case 5:huruf ="Lima";

break;

case 6:huruf ="Enam";

break;

case 7:huruf ="Tujuh";

break;

case 8:huruf ="Delapan";

break;

case 9:huruf ="Sembilan";

break;

case 10:huruf ="Sepuluh";

break;

default:huruf = "Invalid Number!";

}

JOptionPane.showMessageDialog(null,huruf);
    }
}
