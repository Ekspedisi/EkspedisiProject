/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspedisi.controller;

import ekspedisi.util.Koneksi;
import ekspedisi.view.MainFrame;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author M Arif Royanto
 */
public class LandingController {
    
    CardLayoutController controller;
    JPanel MainPanel;
    MainFrame MainFrame;
    
    public LandingController(JPanel MainPanel, MainFrame MainFrame){
        this.MainPanel = MainPanel;
        this.MainFrame = MainFrame;
        
        controller = new CardLayoutController();
        controller.setCardLayout((CardLayout) MainPanel.getLayout());
        controller.setParentCard(MainPanel);
        
        
        MainFrame.getHomeBtn().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("home");
            }
        });
        
        MainFrame.getDirektoriBtn().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("direktori");
            }
        });
        
        MainFrame.getOrderBtn().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("order");
            }
        });
        
        MainFrame.getPremiBtn().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("premi");
            }
        });
        
        MainFrame.getLapRekBtn().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("laprek");
            }
        });
        
        
        
    }
    
    public void refreshTable(){
        try{
            Koneksi.createConnection();
            DefaultTableModel model = (DefaultTableModel) MainFrame.getHomePanel1().getTabel1().getModel();
            model.setRowCount(0);
            Statement statement = Koneksi.conn.createStatement();
            String sql = "SELECT * FROM MASTER_KAB";
            statement.execute(sql);
            
            ResultSet rs = statement.getResultSet();
            while ((rs!=null) && (rs.next())){
                model.addRow(new Object[] {
                    rs.getString(1) ,
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
                });
            }
            rs.close();
            statement.close();
            Koneksi.closeConnection();
        }
        catch(SQLException e){
            System.out.println(e.getMessage() +"z");
            System.out.println("sql refresh");
        }
            
    }
    
}
