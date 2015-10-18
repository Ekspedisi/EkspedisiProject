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
public class DirektoriBtn extends JButton {

    private ImageIcon icon;
    private boolean active;

    public DirektoriBtn() {
        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);

        icon = new ImageIcon(getClass().getResource("/ekspedisi/image-button/DirektoriBtn.png"));
        setIcon(icon);

        setPreferredSize(new Dimension(233, 53));
        setVisible(true);
        setText("");
        active = false;

        addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/ekspedisi/image-button/DirektoriBtn-click.png"));
                setIcon(icon);
                setActive(true);
            }

            @Override
            public void mouseEntered(MouseEvent me) {

                if (isActive()) {
                    icon = new ImageIcon(getClass().getResource("/ekspedisi/image-button/DirektoriBtn-hover-active.png"));
                    setIcon(icon);
                } else {
                    icon = new ImageIcon(getClass().getResource("/ekspedisi/image-button/DirektoriBtn-hover.png"));
                    setIcon(icon);
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if (isActive() == true) {
                    icon = new ImageIcon(getClass().getResource("/ekspedisi/image-button/DirektoriBtn-active.png"));
                    setIcon(icon);
                } else {
                    resetButton();
                }
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/ekspedisi/image-button/DirektoriBtn-active.png"));
                setIcon(icon);
                setActive(true);
            }

        });

    }

    public void resetButton() {
        icon = new ImageIcon(getClass().getResource("/ekspedisi/image-button/DirektoriBtn.png"));
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
