/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspedisi.controller;


import ekspedisi.panel.Direktori;
import ekspedisi.entity.supir;
import ekspedisi.util.Koneksi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author M Arif Royanto
 */
public class DirektoriController {

    private int Index;
    Direktori dir;

    public DirektoriController(Direktori dir) {
        this.dir = dir;

        dir.getAddBtn().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dir.getDialogSupir().setVisible(true);
                dir.getDialogSupir().setLocationRelativeTo(null);
            }
        });

       dir.getAddSupir1().getInputSupir().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // set isi dari entity supir
                    supir sup = new supir();
                    sup.setNama(dir.getAddSupir1().getNamaSupirTxt().getText());
                    sup.setAlamat(dir.getAddSupir1().getAlamatSupirTxt().getText());
                    sup.setNorek(dir.getAddSupir1().getNorekSupirTxt().getText());
                    sup.setNarek(dir.getAddSupir1().getNarekSupirTxt().getText());
                    sup.setBank(dir.getAddSupir1().getBankSupirTxt().getText());
                    //input database
                    Koneksi.createConnection();
                    Statement statement = Koneksi.conn.createStatement();
                    String sql = "INSERT into Supir VALUES(1,'" + sup.getNama()+"','"+ sup.getAlamat()+"','"+ sup.getNorek()+"','" + sup.getNarek()+"','"+ sup.getBank()+"')";
                    System.out.print(sql);
                    statement.execute(sql);
                    //refresh textfield
                    dir.getAddSupir1().getNamaSupirTxt().setText(" ");
                    dir.getAddSupir1().getAlamatSupirTxt().setText(" ");
                    dir.getAddSupir1().getNorekSupirTxt().setText(" ");
                    dir.getAddSupir1().getNarekSupirTxt().setText(" ");
                    dir.getAddSupir1().getBankSupirTxt().setText(" ");
                    
                } catch (SQLException f) {
            System.out.println(f.getMessage() + "z");
            System.out.println("sql refresh");
                             
            }}
        });
       
       // bagian add PT Gabungan
//       dir.getAddGabungan1().getInputSupir().addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    // set isi dari entity supir
//                    supir sup = new supir();
//                    sup.setNama(dir.getAddSupir1().getNamaSupirTxt().getText());
//                    sup.setAlamat(dir.getAddSupir1().getAlamatSupirTxt().getText());
//                    sup.setNorek(dir.getAddSupir1().getNorekSupirTxt().getText());
//                    sup.setNarek(dir.getAddSupir1().getNarekSupirTxt().getText());
//                    sup.setBank(dir.getAddSupir1().getBankSupirTxt().getText());
//                    //input database
//                    Koneksi.createConnection();
//                    Statement statement = Koneksi.conn.createStatement();
//                    String sql = "INSERT into Supir VALUES(1,'" + sup.getNama()+"','"+ sup.getAlamat()+"','"+ sup.getNorek()+"','" + sup.getNarek()+"','"+ sup.getBank()+"')";
//                    System.out.print(sql);
//                    statement.execute(sql);
//                    //refresh textfield
//                    dir.getAddSupir1().getNamaSupirTxt().setText(" ");
//                    dir.getAddSupir1().getAlamatSupirTxt().setText(" ");
//                    dir.getAddSupir1().getNorekSupirTxt().setText(" ");
//                    dir.getAddSupir1().getNarekSupirTxt().setText(" ");
//                    dir.getAddSupir1().getBankSupirTxt().setText(" ");
//                    
//                } catch (SQLException f) {
//            System.out.println(f.getMessage() + "z");
//            System.out.println("sql refresh");
//                             
//            }}
//        });
//       
        dir.getAddSupir1().getCancelSupir().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dir.getDialogSupir().setVisible(false);
            }
        });
        
        dir.getDirCombo().addItemListener(new comboDirListener());

    }

    
    public void RefreshTabel() {
        String sql="";
        if(getIndex()==0){
            sql = "SELECT * FROM Supir";
        } 
        else if (getIndex()==1){
            sql = "SELECT * FROM TRUK";
        }
        else if (getIndex()==2){
            sql = "SELECT * FROM PABRIK";
        }
        else if (getIndex()==3){
            sql = "SELECT * FROM PTGABUNGAN";
        }
        
        System.out.println(sql);
        
        try {
            Koneksi.createConnection();
            DefaultTableModel model = (DefaultTableModel) dir.getTabelDir().getModel();
            model.setRowCount(0);
            Statement statement = Koneksi.conn.createStatement();
            
            statement.execute(sql);
            

            ResultSet rs = statement.getResultSet();

            ResultSetMetaData rsmd = rs.getMetaData();
            

//            System.out.println("columns: " + rsmd.getColumnCount());
//            System.out.println("Column Name of 1st column: " + rsmd.getColumnName(2));
//            System.out.println("Column Type Name of 1st column: " + rsmd.getColumnTypeName(2));

            while ((rs != null) && (rs.next())) {
                model.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
//                        ,
//                    rs.getString(4),
//                    rs.getString(5)
                });
            }
            rs.close();
            statement.close();
            Koneksi.closeConnection();
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "z");
            System.out.println("sql refresh");
        }

    }

    public void IsiTabel() {
        try {
            Koneksi.createConnection();
            DefaultTableModel model = (DefaultTableModel) dir.getTabelDir().getModel();
            model.setRowCount(0);
            Statement statement = Koneksi.conn.createStatement();
            String sql = "SELECT * FROM MASTER_KAB";
            statement.execute(sql);

            ResultSet rs = statement.getResultSet();

            ResultSetMetaData rsmd = rs.getMetaData();

            System.out.println("columns: " + rsmd.getColumnCount());
            System.out.println("Column Name of 1st column: " + rsmd.getColumnName(2));
            System.out.println("Column Type Name of 1st column: " + rsmd.getColumnTypeName(2));

            while ((rs != null) && (rs.next())) {
                model.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
                });
            }
            rs.close();
            statement.close();
            Koneksi.closeConnection();
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "z");
            System.out.println("sql refresh");
        }

    }

    /**
     * @return the Index
     */
    public int getIndex() {
        return Index;
    }

    /**
     * @param Index the Index to set
     */
    public void setIndex(int Index) {
        this.Index = Index;
    }
    
    class comboDirListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            setIndex(dir.getDirCombo().getSelectedIndex());
            RefreshTabel();
            
        }
        
    }

}

