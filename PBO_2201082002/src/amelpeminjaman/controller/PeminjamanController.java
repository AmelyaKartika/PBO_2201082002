/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amelpeminjaman.controller;
import amelpeminjaman.model.*;
import amelpeminjaman.view.FormPeminjaman;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class PeminjamanController {
    private FormPeminjaman formPeminjaman;
    private Peminjaman peminjaman;
    private PeminjamanDao peminjamanDao;

 public PeminjamanController(FormPeminjaman formPeminjaman) {
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = new PeminjamanDao();
    }
public void clearForm(){
    formPeminjaman.getTxtKodeAnggota().setText("");
     formPeminjaman.getTxtKodeBuku().setText("");
      formPeminjaman.getTxtTanggalPinjam().setText("");
       formPeminjaman.getTxtTanggalKembali().setText("");
      
}
public void tampil() {
        DefaultTableModel tabelModel = (DefaultTableModel) 
                formPeminjaman.getTabelPeminjaman().getModel();
        tabelModel.setRowCount(0);
        List<Peminjaman> list = peminjamanDao.getAll();
        for (Peminjaman p : list) {
            Object[] row = {
                p.getKodeAnggota(),
                p.getKodeBuku(),
                p.getTanggalPinjam(),
                p.getTanggalKembali()
            };
            tabelModel.addRow(row);
        }
        
        }
public void savePeminjaman() {
        peminjaman = new Peminjaman();
        peminjaman.setKodeAnggota(formPeminjaman.getTxtKodeAnggota().getText());
        peminjaman.setKodeBuku(formPeminjaman.getTxtKodeBuku().getText());
        peminjaman.setTanggalPinjam(formPeminjaman.getTxtTanggalPinjam().getText());
        peminjaman.setTanggalKembali(formPeminjaman.getTxtTanggalKembali().getText());
        peminjamanDao.insert(peminjaman);
        JOptionPane.showMessageDialog(formPeminjaman, "Insert OK");
    }

    public void updatePeminjaman() {
        int index = formPeminjaman.getTabelPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        peminjaman.setKodeAnggota(formPeminjaman.getTxtKodeAnggota().getText());
        peminjaman.setKodeBuku(formPeminjaman.getTxtKodeBuku().getText());
        peminjaman.setTanggalPinjam(formPeminjaman.getTxtTanggalPinjam().getText());
        peminjaman.setTanggalKembali(formPeminjaman.getTxtTanggalKembali().getText());
        peminjamanDao.update(index, peminjaman);
        JOptionPane.showMessageDialog(formPeminjaman, "Update OK");
    }

    public void getPeminjaman() {
        int index = formPeminjaman.getTabelPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if (peminjaman != null) {
            formPeminjaman.getTxtKodeAnggota().setText(peminjaman.getKodeAnggota());
            formPeminjaman.getTxtKodeBuku().setText(peminjaman.getKodeBuku());
            formPeminjaman.getTxtTanggalPinjam().setText(peminjaman.getTanggalPinjam());
            formPeminjaman.getTxtTanggalKembali().setText(peminjaman.getTanggalKembali());
        }
    }

    public void deletePeminjaman() {
        int index = formPeminjaman.getTabelPeminjaman().getSelectedRow();
        peminjamanDao.delete(index);
        JOptionPane.showMessageDialog(formPeminjaman, "Delete OK");
    }
}