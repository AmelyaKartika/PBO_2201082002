/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amelteori270623modul11;

/**
 *
 * @author hp
 */
public class Student extends Person{
    public Student(){
    super();
    super.name = "Anna";
    super.address = "Padang";
    //memanggil super class
    System.out.println("Inside Student:Constructor");
    }
    //beberapa kode di sini
   
    public String getName(){
    System.out.println("Student: getName");
    return name;
    }

    public static void main(String[] args){
        Student anna = new Student();
        System.out.println("Nama        :"+anna.name);
        System.out.println("Alamat      :"+anna.address);
    }
}
//Sebelumnya di praktek telah membuat sebuah class brnama Student
//untuk pelajaran pewarisan 
//dibuat sebuah kelas dengan nama student lagi turunan dari class person
//dengan kodingan seperti diatas Sekarang, kita ingin membuat class lain bernama Student. Karena Student juga sebagai
//Person, kita putuskan hanya meng-extend class Person
//super(); Kode ini memanggil constructor kedua dari superclass terdekat(yaitu adalah Person) dan
//mengeksekusinya.

