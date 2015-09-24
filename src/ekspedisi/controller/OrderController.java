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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class OrderController {
    
    OrderPanel ord;
    
     public OrderController(OrderPanel ord){
        this.ord=ord;
        DM dm =new DM();
        ord.getAddOrder().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
     }
}
