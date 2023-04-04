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
public class Latihan652 {
    public static void main(String[]args){
       //Statement IF-ELSE\\
 String h =  JOptionPane.showInputDialog("Masukkan sebuah angka antara 1-10 : ");

int nil = Integer.parseInt(h);

String huruf = "";

if (nil == 1)

huruf = "Satu";

else if (nil == 2)

huruf = "Dua";

else if (nil == 3)

huruf = "Tiga";

else if (nil == 4)

huruf = "Empat";

else if (nil == 5)

huruf = "Lima";

else if (nil == 6)

huruf = "Enam";

else if (nil == 7)

huruf = "Tujuh";

else if (nil == 8  )

huruf = "Delapan";

else if (nil == 9)

huruf= "Sembilan";

else if (nil == 10)

huruf = "Sepuluh";

else

huruf = "Invalid Number!";

JOptionPane.showMessageDialog(null,huruf);

}

}     
    
