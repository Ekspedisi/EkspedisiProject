/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspedisi.controller;

import ekspedisi.panel.PremiSupirPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author bimasakti
 */
public class PremiController {
    
    PremiSupirPanel premi;
    
    public PremiController(PremiSupirPanel premi){
        this.premi=premi;
        
        premi.getAddPremiBtn().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                premi.getPremiDialog().setVisible(true);
                premi.getPremiDialog().setSize(505, 352);
                premi.getPremiDialog().setLocationRelativeTo(null);
            }
        });
        
        premi.getAddPremiSupir1().getOkPremi().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                premi.getPremiDialog().setVisible(false);
            }
        });
        
    
    }
}
