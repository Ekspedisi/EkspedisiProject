/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspedisi.controller;

/**
 *
 * @author bimasakti
 */

import ekspedisi.panel.OrderPanel;
import ekspedisi.entity.DM;
import ekspedisi.util.Koneksi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class OrderController {
    
    OrderPanel ord;
    
    public OrderController (OrderPanel ord){
        this.ord = ord;
        
        ord.getAddOrder().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                inputOrder();
            }
        });
        
        ord.getNopolTxt().addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()== KeyEvent.VK_ENTER){
                    ord.getSupirTxt().requestFocus();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        ord.getSupirTxt().addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()== KeyEvent.VK_ENTER){
                    ord.getSanguTxt().requestFocus();
                    ord.getNoDM().setText("ini nomor DM lho");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        ord.getSanguTxt().addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()== KeyEvent.VK_ENTER){
                    ord.getTanggalTxt().requestFocus();
                    
                }
            }
            

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        ord.getOngkosTxt().addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int b = Integer.parseInt(ord.getBeratTxt().getText());
                int a = Integer.parseInt(ord.getOngkosTxt().getText());
                if (e.getKeyCode()== KeyEvent.VK_ENTER){
                    ord.getOngkosgab().requestFocus();
                    ord.getJumlahPbr().setText(String.valueOf(jumlahp(a, b)));
                    ord.getBeratTxt1().setText(ord.getBeratTxt().getText());
                    
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
                
        ord.getBoronganCb().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int b = Integer.parseInt(ord.getBeratTxt().getText());
                int a = Integer.parseInt(ord.getOngkosTxt().getText());
                
                if(ord.getBoronganCb().isSelected()){
                    ord.getJumlahPbr().setText("1000000 ");
                }
                else{
                    ord.getJumlahPbr().setText(String.valueOf(jumlahp(a, b))); 
                }
            }
        });
        
        ord.getOngkosgab().addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                }

            @Override
            public void keyPressed(KeyEvent e) {
                int b = Integer.parseInt(ord.getBeratTxt1().getText());
                int a = Integer.parseInt(ord.getOngkosgab().getText());
                if (e.getKeyCode()== KeyEvent.VK_ENTER){
                    ord.getAddOrder().requestFocus();
                    ord.getJumlahGab().setText(String.valueOf(jumlahp(a, b)));
                    
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
    }
    public void inputOrder(){
        try {
        DM dm = new DM();
            System.out.println("masuk input");
        dm.setGabungan(ord.getGabunganCmb().getSelectedItem().toString());
        dm.setSupir(ord.getSupirTxt().getText());
        dm.setNopol(ord.getNopolTxt().getText());
        dm.setNoDM(ord.getNoDM().getText());
        dm.setSangu(ord.getSanguTxt().getText());
        dm.setPengirim(ord.getPengirimTxt().getText());
        dm.setKota(ord.getKotaCmb().getSelectedItem().toString());
        dm.setPenerima(ord.getPenerimaTxt().getText());
        dm.setTujuan(ord.getTujuanCmb().getSelectedItem().toString());
        dm.setBarang(ord.getBarangTxt().getText());
        dm.setInvoice(ord.getInv_No().getText());
        dm.setBerat(Integer.parseInt(ord.getBeratTxt().getText()));
        ord.setBeratTxt1(ord.getBeratTxt());
        dm.setOngkosp(Integer.parseInt(ord.getOngkosTxt().getText()));
        dm.setJumlahp(Integer.parseInt(ord.getJumlahPbr().getText()));
        System.out.print(dm.getJumlahp());
        dm.setOngkosg(Integer.parseInt(ord.getOngkosgab().getText()));
        dm.setJumlahg(jumlahp(dm.getOngkosg(), dm.getBerat()));
        
        Koneksi.createConnection();
            Statement statement = Koneksi.conn.createStatement();
            String sql = "INSERT into DM VALUES (1," + dm.getNoDM() + "','" + dm.getGabungan() + "','" + dm.getNopol() + "','" + dm.getSupir() + "','" + dm.getSangu() + "','" + dm.getPengirim() + "','" + dm.getKota() + "','" + dm.getPenerima() + "','" + dm.getTujuan() + "','" + dm.getBarang() + "','" + dm.getInvoice() + "','" + dm.getBerat() + "','" + dm.getOngkosp() + "','" + dm.getJumlahp() + "','" + dm.getOngkosg() + "','" + dm.getJumlahg()+ "')";
            
            System.out.print(sql);
            statement.execute(sql);
        }   catch (SQLException f) {
                System.out.println(f.getMessage());
                System.out.println("sql DM error");

        }
    }
    public int jumlahp(int ong, int ber){
       int jumlahpabrik = 0;
        
            jumlahpabrik= ong * ber;
        
        return jumlahpabrik; 
    }
      
}
