/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspedisi.controller;

import ekspedisi.panel.MainPanel;
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
    MainPanel MainPanel;
    MainFrame MainFrame;
    
    public LandingController(MainPanel MainPanel, MainFrame MainFrame){
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
                MainPanel.getDirektori1().getController().RefreshTabel();
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
                controller.show("rekening");
            }
        });
        MainFrame.getBukuBesarBtn().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("bukubesar");
            }
        });
        
    }
    
}
