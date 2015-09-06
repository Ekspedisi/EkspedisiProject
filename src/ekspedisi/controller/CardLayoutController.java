/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspedisi.controller;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author M Arif Royanto
 */
public class CardLayoutController {

    private CardLayout cardLayout;
    private JPanel parentCard;

    public CardLayout getCardLayout() {
        return cardLayout;
    }

    public void setCardLayout(CardLayout cardLayout) {
        this.cardLayout = cardLayout;
    }

    public JPanel getParentCard() {
        return parentCard;
    }

    public void setParentCard(JPanel parentCard) {
        this.parentCard = parentCard;
    }

    public void next() {
        cardLayout.next(parentCard);
    }

    public void previous() {
        cardLayout.previous(parentCard);
    }

    public void show(String cardName) {
        cardLayout.show(parentCard, cardName);
    }

    public JScrollPane getScrollCard() {
        for (Component comp : parentCard.getComponents()) {
            if (comp.isVisible()) {
                if(comp instanceof JScrollPane){
                    System.out.println(comp.getName());
                    return (JScrollPane) comp;
                }
            }
        }
        return null;
    }
}