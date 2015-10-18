/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspedisi.controller;

import ekspedisi.PanelComponent.NavBar;
import ekspedisi.panel.MainPanel;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author M Arif Royanto
 */
public class LandingController {

    CardLayoutController controller;
    MainPanel MainPanel;
    NavBar navbar;
    final Object[] Btn = new JButton[9];

    public LandingController(MainPanel MainPanel, NavBar navbar) {
        this.MainPanel = MainPanel;
        this.navbar = navbar;

        controller = new CardLayoutController();
        controller.setCardLayout((CardLayout) MainPanel.getLayout());
        controller.setParentCard(MainPanel);

        navbar.getHomeBtn1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                controller.show("home");
                navbar.getOrderBtn1().resetButton();
                navbar.getTagihanBtn1().resetButton();
                navbar.getPembayaranBtn1().resetButton();
                navbar.getPremiBtn1().resetButton();
                navbar.getBukuBtn1().resetButton();
                navbar.getLaporanBtn1().resetButton();
                navbar.getDirektoriBtn1().resetButton();
                navbar.getLogoutBtn1().resetButton();

            }
        });
        
        navbar.getOrderBtn1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                controller.show("order");
                navbar.getHomeBtn1().resetButton();
                navbar.getTagihanBtn1().resetButton();
                navbar.getPembayaranBtn1().resetButton();
                navbar.getPremiBtn1().resetButton();
                navbar.getBukuBtn1().resetButton();
                navbar.getLaporanBtn1().resetButton();
                navbar.getDirektoriBtn1().resetButton();
                navbar.getLogoutBtn1().resetButton();

            }
        });
        
        navbar.getTagihanBtn1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                controller.show("tagihan");
                navbar.getHomeBtn1().resetButton();
                navbar.getOrderBtn1().resetButton();
                navbar.getPembayaranBtn1().resetButton();
                navbar.getPremiBtn1().resetButton();
                navbar.getBukuBtn1().resetButton();
                navbar.getLaporanBtn1().resetButton();
                navbar.getDirektoriBtn1().resetButton();
                navbar.getLogoutBtn1().resetButton();

            }
        });
        
        navbar.getPembayaranBtn1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                controller.show("pembayaran");
                navbar.getHomeBtn1().resetButton();
                navbar.getOrderBtn1().resetButton();
                navbar.getTagihanBtn1().resetButton();
                navbar.getPremiBtn1().resetButton();
                navbar.getBukuBtn1().resetButton();
                navbar.getLaporanBtn1().resetButton();
                navbar.getDirektoriBtn1().resetButton();
                navbar.getLogoutBtn1().resetButton();

            }
        });
        
        navbar.getPremiBtn1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                controller.show("premi");
                navbar.getHomeBtn1().resetButton();
                navbar.getOrderBtn1().resetButton();
                navbar.getTagihanBtn1().resetButton();
                navbar.getPembayaranBtn1().resetButton();
                navbar.getBukuBtn1().resetButton();
                navbar.getLaporanBtn1().resetButton();
                navbar.getDirektoriBtn1().resetButton();
                navbar.getLogoutBtn1().resetButton();

            }
        });
        
        navbar.getBukuBtn1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                controller.show("buku");
                navbar.getHomeBtn1().resetButton();
                navbar.getOrderBtn1().resetButton();
                navbar.getTagihanBtn1().resetButton();
                navbar.getPembayaranBtn1().resetButton();
                navbar.getPremiBtn1().resetButton();
                navbar.getLaporanBtn1().resetButton();
                navbar.getDirektoriBtn1().resetButton();
                navbar.getLogoutBtn1().resetButton();

            }
        });
        
        navbar.getLaporanBtn1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                controller.show("laporan");
                navbar.getHomeBtn1().resetButton();
                navbar.getOrderBtn1().resetButton();
                navbar.getTagihanBtn1().resetButton();
                navbar.getPembayaranBtn1().resetButton();
                navbar.getPremiBtn1().resetButton();
                navbar.getBukuBtn1().resetButton();
                navbar.getDirektoriBtn1().resetButton();
                navbar.getLogoutBtn1().resetButton();

            }
        });
        
        navbar.getDirektoriBtn1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                controller.show("direktori");
                navbar.getHomeBtn1().resetButton();
                navbar.getOrderBtn1().resetButton();
                navbar.getTagihanBtn1().resetButton();
                navbar.getPembayaranBtn1().resetButton();
                navbar.getPremiBtn1().resetButton();
                navbar.getBukuBtn1().resetButton();
                navbar.getLaporanBtn1().resetButton();
                navbar.getLogoutBtn1().resetButton();

            }
        });
        
        navbar.getLogoutBtn1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                controller.show("logout");
                navbar.getHomeBtn1().resetButton();
                navbar.getOrderBtn1().resetButton();
                navbar.getTagihanBtn1().resetButton();
                navbar.getPembayaranBtn1().resetButton();
                navbar.getPremiBtn1().resetButton();
                navbar.getBukuBtn1().resetButton();
                navbar.getLaporanBtn1().resetButton();
                navbar.getDirektoriBtn1().resetButton();

            }
        });

    }

    public void resetButButton(JButton active) {
        for (int i = 0; i < Btn.length; i++) {
            if (active != Btn[i]) {

            }
        }
    }

}
