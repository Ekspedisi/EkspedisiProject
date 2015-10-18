/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspedisi.component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author GUE
 */
public class BukuBtn extends JButton {

    private ImageIcon icon;
    private boolean active;

    public BukuBtn() {
        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);

        icon = new ImageIcon(getClass().getResource("/ekspedisi/image-button/BukuBtn.png"));
        setIcon(icon);

        setPreferredSize(new Dimension(233, 55));
        setText("");
        setVisible(true);
        
        active = false;

        addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/ekspedisi/image-button/BukuBtn-click.png"));
                setIcon(icon);
                setActive(true);
            }

            @Override
            public void mouseEntered(MouseEvent me) {

                if (isActive()) {
                    icon = new ImageIcon(getClass().getResource("/ekspedisi/image-button/BukuBtn-hover-active.png"));
                    setIcon(icon);
                } else {
                    icon = new ImageIcon(getClass().getResource("/ekspedisi/image-button/BukuBtn-hover.png"));
                    setIcon(icon);
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if (isActive() == true) {
                    icon = new ImageIcon(getClass().getResource("/ekspedisi/image-button/BukuBtn-active.png"));
                    setIcon(icon);
                } else {
                    resetButton();
                }
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/ekspedisi/image-button/BukuBtn-active.png"));
                setIcon(icon);
                setActive(true);
            }

        });

    }

    public void resetButton() {
        icon = new ImageIcon(getClass().getResource("/ekspedisi/image-button/BukuBtn.png"));
        setIcon(icon);
        setActive(false);
    }

    /**
     * @return the active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(boolean active) {

        this.active = active;
    }

}
