/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AmelyaKartika280323;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author hp
 */
public class Latihan511 {
   public static void main(String [] args) {

BufferedReader dataIn = 
        new BufferedReader (new InputStreamReader(System.in));

String word1="";

System.out.print("Masukkan kata pertama : ");

try {

word1 = dataIn.readLine(); }

catch ( IOException e) { System.out.println("Error!"); }

String word2="";

System.out.print("Masukkan kata kedua : ");

try {
word2 = dataIn.readLine(); }

catch ( IOException e) { System.out.println("Error!"); }

String word3="";

System.out.print("Masukkan kata ketiga : ");

try {

word3 = dataIn.readLine(); }

catch ( IOException e) { System.out.println("Error!"); }

System.out.println(word1+" "+word2+" "+word3);

}

}
