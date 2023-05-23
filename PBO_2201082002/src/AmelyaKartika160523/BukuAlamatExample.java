/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AmelyaKartika160523;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author hp
 */
public class BukuAlamatExample {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        BukuAlamatData data = new BukuAlamatData();
        
        int pil=0;
        try {
            
            while(pil!=5){
                System.out.println("============================");
                System.out.println("1.Memasukkan data");
                System.out.println("2.Menghapus data");
                System.out.println("3.Update Data");
                System.out.println("4.Menampilkan seluruh data");
                System.out.print("Pilihan Anda ?");
                pil =Integer.parseInt(dataIn.readLine());
             switch(pil){
                case 1:
                        BukuAlamat temp = new BukuAlamat();
                        System.out.print("Nama      :");
                        temp.setNama(dataIn.readLine());
                        System.out.print("Alamat    :");
                        temp.setAlamat(dataIn.readLine());
                        System.out.print("No Telp   :");
                        temp.setNoTelepon(dataIn.readLine());
                        System.out.print("Email     :");
                        temp.setEmail(dataIn.readLine());
                        data.insert(temp); 
                        break;
                    case 2:
                        System.out.print("Masukkan indeks data yang ingin dihapus: ");
                        int index = Integer.parseInt(dataIn.readLine());
                        data.delete(index);
                        System.out.println("Data berhasil dihapus.");
                        break;
                    case 3:
                        System.out.print("Masukkan indeks data yang ingin diupdate: ");
                        int indexToUpdate = Integer.parseInt(dataIn.readLine());
                        BukuAlamat updatedData = new BukuAlamat();
                        System.out.print("Nama      :");
                        updatedData.setNama(dataIn.readLine());
                        System.out.print("Alamat    :");
                        updatedData.setAlamat(dataIn.readLine());
                        System.out.print("No Telp   :");
                        updatedData.setNoTelepon(dataIn.readLine());
                        System.out.print("Email     :");
                        updatedData.setEmail(dataIn.readLine());
                        data.update(indexToUpdate, updatedData);
                        System.out.println("Data berhasil diupdate.");
                        break;
                    case 4:
                        BukuAlamat[] list = data.getData();
                        for(int i=0;i<list.length;i++){
                            System.out.println("Buku Alamat ke--->"+(i+1));
                            System.out.println("Nama    :"+list[i].getNama());
                            System.out.println("Alamat  :"+list[i].getAlamat());
                            System.out.println("No Telp :"+list[i].getNoTelepon());
                            System.out.println("Email   :"+list[i].getEmail());
                        }
                        break;
                    
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih nomor menu yang tersedia.");
                        break;
                }
            }

        } catch (IOException ex) {
            System.out.println("Terjadi kesalahan pada masukan/keluaran.");
            ex.printStackTrace();
        }
    catch (NumberFormatException ex) {
                System.out.println("Masukan tidak valid. Harap masukkan angka yang benar.");
            } 
    }
}
         //tugas kita adalah bikin menu  
         //sudah dicontohkan bapak yang insert
         //ditekan 1 tampil insert
         //tekan 2 tampil delete
      
         //kalau menu berarti minta input dari user
 

