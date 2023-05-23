/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AmelyaKartika160523;

/**
 *
 * @author hp
 */
public class StudentRecordExample {
   public static void main( String[] args ){

       StudentRecord anna = new StudentRecord();
        //mengisi pakai set kalau mengambil pakai get
        //mengisi nilai variabel
    anna.setName("Anna");
    anna.setAddress("Padang");
    anna.setAge(18);
    anna.setMathGrade(90);
    anna.setEnglishGrade(70);
    anna.setScienceGrade(80);
    /////

    System.out.println("Name              :" +anna.getName());
    System.out.println("Address           :" +anna.getAddress());
    System.out.println("Age               :" +anna.getAge());
    System.out.println("Mathematic        :" +anna.getMathGrade());
    System.out.println("English           :" +anna.getEnglishGrade());
    System.out.println("Science           :" +anna.getScienceGrade());
    System.out.println("Average           :" +anna.getAverage());
    
    
StudentRecord ali = new StudentRecord();
    ali.setName("Ali");
    ali.setAddress("Padang");
    ali.print(" ");
    ali.print(80,70,90);
    
    StudentRecord budi = new StudentRecord("Budi");
    budi.print(" ");
    budi.print(80, 70, 90);
System.out.println("Count   :" +StudentRecord.getStudentCount ());
   
    }

}

    
   
    

 //Menampilkan jumlah siswa


