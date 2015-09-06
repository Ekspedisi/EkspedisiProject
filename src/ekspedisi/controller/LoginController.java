/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspedisi.controller;

import ekspedisi.Ekspedisi;
import ekspedisi.view.LoginFrame;
import ekspedisi.view.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author M Arif Royanto
 */
public class LoginController {
    
    LoginFrame Login;
    
    public LoginController(LoginFrame Login){
        this.Login= Login;
        
        Login.getExitbtn().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        Login.getLoginBtn().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Login.setVisible(false);
                MainFrame.getInstace().setVisible(true);
                
            }
        });
        
    }
    
}
