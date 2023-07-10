/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amelpengembalian.controller;
import amelpengembalian.model.*;
import amelpengembalian.view.FormPengembalian;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class PengembalianController {

    private FormPengembalian formPengembalian;
    private Pengembalian pengembalian;
    private PengembalianDao pengembalianDao;

    public PengembalianController(FormPengembalian formPengembalian) {
        this.formPengembalian = formPengembalian;
        pengembalianDao = new PengembalianDao();
    }

    public void clearForm() {
        formPengembalian.getTxtKodeAnggota().setText("");
        formPengembalian.getTxtNamaAnggota().setText("");
        formPengembalian.getTxtKodeBuku().setText("");
        formPengembalian.getTxtJudulBuku().setText("");
        formPengembalian.getTxtTanggalPinjam().setText("");
        formPengembalian.getTxtTanggalKembali().setText("");
        formPengembalian.getTxtTerlambat().setText("");
        formPengembalian.getTxtDenda().setText("");
    }

    public void tampil() {
        DefaultTableModel tabelModel = (DefaultTableModel) formPengembalian.getTabelPengembalian().getModel();
        tabelModel.setRowCount(0);
        List<Pengembalian> list = pengembalianDao.getAll();
        for (Pengembalian p : list) {
            Object[] row = {
                    p.getKodeAnggota(),
                    p.getNamaAnggota(),
                    p.getKodeBuku(),
                    p.getJudulBuku(),
                    p.getTanggalPinjam(),
                    p.getTanggalKembali(),
                    p.getTerlambat(),
                    p.getDenda()
            };
            tabelModel.addRow(row);
        }
    }

    public void savePengembalian() {
        pengembalian = new Pengembalian();
        pengembalian.setKodeAnggota(formPengembalian.getTxtKodeAnggota().getText());
        pengembalian.setNamaAnggota(formPengembalian.getTxtNamaAnggota().getText());
        pengembalian.setKodeBuku(formPengembalian.getTxtKodeBuku().getText());
        pengembalian.setJudulBuku(formPengembalian.getTxtJudulBuku().getText());
        pengembalian.setTanggalPinjam(formPengembalian.getTxtTanggalPinjam().getText());
        pengembalian.setTanggalKembali(formPengembalian.getTxtTanggalKembali().getText());
        pengembalian.setTerlambat(Integer.parseInt(formPengembalian.getTxtTerlambat().getText()));
        pengembalian.setDenda(Double.parseDouble(formPengembalian.getTxtDenda().getText()));
        pengembalianDao.insert(pengembalian);
        JOptionPane.showMessageDialog(formPengembalian, "Insert OK");
    }

    public void updatePengembalian() {
        int index = formPengembalian.getTabelPengembalian().getSelectedRow();
        pengembalian = pengembalianDao.getPengembalian(index);
        pengembalian.setKodeAnggota(formPengembalian.getTxtKodeAnggota().getText());
        pengembalian.setNamaAnggota(formPengembalian.getTxtNamaAnggota().getText());
        pengembalian.setKodeBuku(formPengembalian.getTxtKodeBuku().getText());
        pengembalian.setJudulBuku(formPengembalian.getTxtJudulBuku().getText());
        pengembalian.setTanggalPinjam(formPengembalian.getTxtTanggalPinjam().getText());
        pengembalian.setTanggalKembali(formPengembalian.getTxtTanggalKembali().getText());
        pengembalian.setTerlambat(Integer.parseInt(formPengembalian.getTxtTerlambat().getText()));
        pengembalian.setDenda(Double.parseDouble(formPengembalian.getTxtDenda().getText()));
        pengembalianDao.update(index, pengembalian);
        JOptionPane.showMessageDialog(formPengembalian, "Update OK");
    }

    public void getPengembalian() {
        int index = formPengembalian.getTabelPengembalian().getSelectedRow();
        pengembalian = pengembalianDao.getPengembalian(index);
        if (pengembalian != null) {
            formPengembalian.getTxtKodeAnggota().setText(pengembalian.getKodeAnggota());
            formPengembalian.getTxtNamaAnggota().setText(pengembalian.getNamaAnggota());
            formPengembalian.getTxtKodeBuku().setText(pengembalian.getKodeBuku());
            formPengembalian.getTxtJudulBuku().setText(pengembalian.getJudulBuku());
            formPengembalian.getTxtTanggalPinjam().setText(pengembalian.getTanggalPinjam());
            formPengembalian.getTxtTanggalKembali().setText(pengembalian.getTanggalKembali());
            formPengembalian.getTxtTerlambat().setText(String.valueOf(pengembalian.getTerlambat()));
            formPengembalian.getTxtDenda().setText(String.valueOf(pengembalian.getDenda()));
        }
    }

    public void deletePengembalian() {
        int index = formPengembalian.getTabelPengembalian().getSelectedRow();
        pengembalianDao.delete(index);
        JOptionPane.showMessageDialog(formPengembalian, "Delete OK");
    }
}

