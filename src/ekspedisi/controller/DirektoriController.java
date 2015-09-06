/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspedisi.controller;

import ekspedisi.panel.Direktori;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author M Arif Royanto
 */
public class DirektoriController {
    
    Direktori dir;
    
    public DirektoriController(Direktori dir){
        this.dir=dir;
        
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
                dir.getDialogSupir().setVisible(false);
            }
        });
        
        dir.getAddSupir1().getCancelSupir().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dir.getDialogSupir().setVisible(false);
            }
        });
        
    }
    
    
    
}
