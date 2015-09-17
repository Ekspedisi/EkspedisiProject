/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspedisi.controller;

import ekspedisi.panel.BukuBesar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author bimasakti
 */

public class BukuBesarController {
    
    BukuBesar bub;
    
    public BukuBesarController(BukuBesar bub){
        this.bub=bub;
        
        bub.getAddBtn().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                bub.getAddTrans().setVisible(true);
                bub.getAddTrans().setLocationRelativeTo(null);
            }
        } );
    }   
}
