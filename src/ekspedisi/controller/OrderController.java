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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderController {
    
    OrderPanel ord;
    
     public OrderController(OrderPanel ord){
        this.ord=ord;
        
        ord.getAddOrder().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
     }
}
