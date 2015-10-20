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
import java.util.Date;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat; 
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class OrderController {
    
    OrderPanel ord;
    
    public OrderController (OrderPanel ord){
        this.ord = ord;
        isiCmb();
        isiOrder();
        ord.getAddOrder().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                int pilih = JOptionPane.showConfirmDialog(null,"Apakah data yang di input sudah benar?","Confirmation",JOptionPane.YES_NO_OPTION);
                   
                if(pilih == JOptionPane.YES_OPTION){
                      inputOrder();
                      clearOrder();
                }else if(pilih == JOptionPane.NO_OPTION){
                }
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

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()== KeyEvent.VK_ENTER){
                    ord.getSanguTxt().requestFocus();
                    setDM();
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
                    ord.getPengirimTxt().requestFocus();
                    ord.getTanggalTxt().setText(pickTanggal());
                }
            }
            

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        ord.getPengirimTxt().addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()== KeyEvent.VK_ENTER){
                    ord.getKotaCmb().requestFocus();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        }); 
        
        ord.getPenerimaTxt().addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()== KeyEvent.VK_ENTER){
                    ord.getTujuanCmb().requestFocus();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        
        ord.getBarangTxt().addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
               if (e.getKeyCode()== KeyEvent.VK_ENTER){
                    ord.getBeratTxt().requestFocus();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        
        ord.getBeratTxt().addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            if (e.getKeyCode()== KeyEvent.VK_ENTER){
                    ord.getBeratTxt1().setText(ord.getBeratTxt().getText());
                    ord.getOngkosTxt().requestFocus();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        
        ord.getOngkosTxt().addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
                if (e.getKeyCode()== KeyEvent.VK_ENTER){
                    int b = Integer.parseInt(ord.getBeratTxt().getText());
                    int a = Integer.parseInt(ord.getOngkosTxt().getText());
                    ord.getOngkosgab().requestFocus();
                    ord.getJumlahPbr().setText(String.valueOf(jumlahp(a, b)));
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
                
                if (e.getKeyCode()== KeyEvent.VK_ENTER){
                    int b = Integer.parseInt(ord.getBeratTxt1().getText());
                int a = Integer.parseInt(ord.getOngkosgab().getText());
                    ord.getAddOrder().requestFocus();
                    ord.getJumlahGab().setText(String.valueOf(jumlahp(a, b)));
                    
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        ord.getInvoiceBtn().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ord.getDialogInvoice().pack();
                ord.getDialogInvoice().setLocationRelativeTo(null);
                ord.getDialogInvoice().setVisible(true);
          
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
        dm.setTanggal(ord.getTanggalTxt().getText());
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
        dm.setOngkosg(Integer.parseInt(ord.getOngkosgab().getText()));
        dm.setJumlahg(Integer.parseInt(ord.getJumlahGab().getText()));
        dm.setPembayaran(false);
        Koneksi.createConnection();
            Statement statement = Koneksi.conn.createStatement();
            String sql = "INSERT into DM VALUES (1,'" + dm.getNoDM() + "','" + dm.getGabungan() + "','" + dm.getNopol() + "','" + dm.getSupir() + "'," + dm.getSangu() + ",'" + dm.getTanggal()+ "','" + dm.getPengirim() + "','" + dm.getKota() + "','" + dm.getPenerima() + "','" + dm.getTujuan() + "','" + dm.getBarang() + "','" + dm.getInvoice() + "'," + dm.getBerat() + "," + dm.getOngkosp() + "," + dm.getJumlahp() + "," + dm.getOngkosg() + "," + dm.getJumlahg()+ "," + dm.isPembayaran() + ")";
            
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
    
    public String pickTanggal(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
        Date date = new Date();  
        return dateFormat.format(date);  
        
    }
    public void isiCmb(){
        try {
            Koneksi.createConnection();
            Statement statement = Koneksi.conn.createStatement();
            String sqlisi= "SELECT NAMA FROM MASTER_KAB ORDER BY NAMA ASC ";
            String sqlgab= "SELECT NAMA FROM PTGabungan ORDER BY NAMA ASC";
            ResultSet res = statement.executeQuery(sqlisi);
            ResultSet re = statement.executeQuery(sqlgab);
            while (res.next()) {
                ord.getKotaCmb().addItem(res.getString(1));
                ord.getTujuanCmb().addItem(res.getString(1));
            }
            while (re.next()){
                ord.getGabunganCmb().addItem(re.getString(1));
            }
        } catch (SQLException f) {
                System.out.println(f.getMessage());
                System.out.println("sql isicombo error");

        }
        
    }
      
    public void setDM(){
        String dmNo= "";
        
        DateFormat dateFormat = new SimpleDateFormat("yyyyMM");  
        Date date = new Date();
        
        String t = dateFormat.format(date);  
        try {
            Koneksi.createConnection();
            Statement statement = Koneksi.conn.createStatement();
            String query = "SELECT TOP 1 NoDM FROM DM order by NoDM desc";
            
                ResultSet rs = statement.executeQuery(query);
		if (rs.next()){
                    while(rs.next()) {
                        System.out.print("masuk while");
                        String result = rs.getString(1);
                        String No = result.substring(8);
                        int intNo = Integer.parseInt(No);
                        intNo = intNo +1 ;
                        ord.getNoDM().setText("DM" + t + intNo);
                        rs.close();
                        statement.close();                  
                    }
                }else {
                    System.out.print("kosong");
                    ord.getNoDM().setText("DM" + t + "0001");
                }
                }   catch(Exception ex){
                    System.out.println(ex.getMessage());
                    System.out.println("sql setDM error");
		}
	}
    public void clearOrder (){
        ord.getNopolTxt().setText("");
        ord.getSupirTxt().setText("");
        ord.getNoDM().setText("");
        ord.getSanguTxt().setText("");
        ord.getTanggalTxt().setText("");
        ord.getPengirimTxt().setText("");
        ord.getPenerimaTxt().setText("");
        ord.getBarangTxt().setText("");
        ord.getInv_No().setText("");
        ord.getBeratTxt().setText("");
        ord.getBeratTxt1().setText("");
        ord.getOngkosTxt().setText("");
        ord.getJumlahPbr().setText("");
        ord.getOngkosgab().setText("");
        ord.getJumlahGab().setText("");
    }
    
    public void isiOrder(){
        DefaultTableModel model = (DefaultTableModel) ord.getOrderTabel().getModel();
        model.setRowCount(0);
        model.setColumnCount(0);
        model.addColumn("No DM");
        model.addColumn("Nopol");
        model.addColumn("Pengirim");
        model.addColumn("Tujuan");
        model.addColumn("Tagihan");
        //model.addColumn("Bank");
        
    }
    
    
        
    }

