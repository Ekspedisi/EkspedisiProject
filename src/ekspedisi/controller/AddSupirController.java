/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspedisi.controller;

import ekspedisi.entity.supir;
import ekspedisi.panel.AddSupir;
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
 * @author bimasakti
 */
public class AddSupirController {
    
    AddSupir Asupir;
    public AddSupirController(AddSupir Asupir){
        this.Asupir=Asupir;
        
        Asupir.getInputSupir().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                supir sup = new supir ();
            sup.setNama(Asupir.getNamaSupirTxt().getText());
            sup.setAlamat(Asupir.getAlamatSupirTxt().getText());
            sup.setNorek(Asupir.getNorekSupirTxt().getText());
            sup.setNarek(Asupir.getNarekSupirTxt().getText());
            sup.setBank(Asupir.getBankSupirTxt().getText());
        
            try {
                Koneksi.createConnection();
                Statement statement = Koneksi.conn.createStatement();
                String sql = "INSERT TO Supir VALUES ('" + sup.getNama() + "','" + sup.getAlamat() + "','" + sup.getNorek() + "','" + sup.getNarek() + "','" + sup.getBank()+"')";
                System.out.println(sql);
                statement.execute(sql);
            
                    
            } catch(SQLException a) {
            System.out.println(a.getMessage() + "z");
            System.out.println("sql refresh");
            }
            }
        });
        
}
}

