/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amelpeminjaman.model;
import java.util.*;
import java.util.ArrayList;
/**
 *
 * @author hp
 */
public class PeminjamanDao {
     private List<Peminjaman> data = new ArrayList<>();

    public PeminjamanDao() {
        // Contoh data awal
        data.add(new Peminjaman("A001", "B001", "2023-06-01", "2023-06-07"));
        data.add(new Peminjaman("A002", "B002", "2023-06-03", "2023-06-10"));
    }

    public void insert(Peminjaman peminjaman) {
        data.add(peminjaman);
    }

    public void update(int index, Peminjaman peminjaman) {
        data.set(index, peminjaman);
    }

    public void delete(int index) {
        data.remove(index);
    }

    public Peminjaman getPeminjaman(int index) {
        return data.get(index);
    }

    public List<Peminjaman> getAll() {
        return data;
    }

}
