/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amelbuku.controller;
import amelbuku.model.*;
import amelbuku.view.FromBuku;
import amelpeminjaman.controller.PeminjamanController;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class BukuController {
    private FromBuku formBuku;
    private Buku buku;
    private BukuDao bukuDao;
    private PeminjamanController peminjamanController;
    
    public BukuController(FromBuku formBuku){
        this.formBuku =formBuku ;
        bukuDao = new BukuDao();
        
    }
    public void setPeminjamanController(PeminjamanController peminjamanController) {
    this.peminjamanController = peminjamanController;
}
   
    public void clearForm(){
        formBuku.getTxtJudulBuku().setText("");
       formBuku.getTxtPengarang().setText("");
        formBuku.getTxtPenerbit().setText("");
        
    }
    public void tampil(){
       DefaultTableModel tabelModel = (DefaultTableModel) 
               formBuku.getTabelBuku().getModel();
       tabelModel.setRowCount(0);
       List<Buku> list =bukuDao.getAll();
       for (Buku a : list){
        Object [] row ={
            a.getKodeBuku(),
            a.getJudulBuku(),
            a.getPengarang(),
            a.getPenerbit(),
            
        };
        tabelModel.addRow(row);
        
    }
       
           
    }
    public void saveBuku(){
        buku = new Buku();
        buku.setKodeBuku(formBuku.getTxtKodeBuku().getText());
        buku.setJudulBuku(formBuku.getTxtJudulBuku().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
         bukuDao.insert(buku);
        JOptionPane.showMessageDialog(formBuku,"insert OK");
       // Update kode buku di Form Peminjaman
         peminjamanController.updateKodeBuku(formBuku.getTxtKodeBuku().getText());
    }
    
    public void updateBuku(){
        int index = formBuku.getTabelBuku().getSelectedRow();
        buku = bukuDao.getBuku(index);
        buku.setKodeBuku(formBuku.getTxtKodeBuku().getText());
        buku.setJudulBuku(formBuku.getTxtJudulBuku().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        bukuDao.update(index, buku);
        JOptionPane.showMessageDialog(formBuku,"Update OK");
    }
    
    public void getBuku(){
        int index = formBuku.getTabelBuku().getSelectedRow();
        buku = bukuDao.getBuku(index);
        if(buku!=null){
            formBuku.getTxtKodeBuku().setText(buku.getKodeBuku());
            formBuku.getTxtJudulBuku().setText(buku.getJudulBuku());
            formBuku.getTxtPengarang().setText(buku.getPengarang());
            formBuku.getTxtPenerbit().setText(buku.getPenerbit());
        }
    }
    
    public void deleteBuku(){
        int index = formBuku.getTabelBuku().getSelectedRow();
        bukuDao.delete(index);
         JOptionPane.showMessageDialog(formBuku,"Delete OK");  
    }
    
}
