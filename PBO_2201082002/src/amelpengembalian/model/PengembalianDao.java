/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amelpengembalian.model;
import java.util.*;
import java.util.ArrayList;
/**
 *
 * @author hp
 */
public class PengembalianDao {

    private List<Pengembalian> data = new ArrayList<>();

    public PengembalianDao() {
        // Contoh data awal
        data.add(new Pengembalian("A001", "Amelya Kartika", "B001", "Perahu Kertas", "2023-06-01", "2023-06-07", 2, 2000.0));
        data.add(new Pengembalian("A002", "John Doe", "B002", "Harry Potter", "2023-06-03", "2023-06-10", 5, 5000.0));
    }

    public void insert(Pengembalian pengembalian) {
        data.add(pengembalian);
    }

    public void update(int index, Pengembalian pengembalian) {
        data.set(index, pengembalian);
    }

    public void delete(int index) {
        data.remove(index);
    }

    public Pengembalian getPengembalian(int index) {
        return data.get(index);
    }

    public List<Pengembalian> getAll() {
        return data;
    }
}