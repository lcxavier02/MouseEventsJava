package mouseevents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends JFrame {

    public MouseEvents() {
        super("Mouse Eventos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Haz clic o mueve el mouse dentro de la ventana.");
        panel.add(label);
        
        add(panel);
        setVisible(true);
        
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clickeado en: (" + e.getX() + ", " + e.getY() + ")");
            }
            
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse presionado en: (" + e.getX() + ", " + e.getY() + ")");
            }
            
            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse soltado en: (" + e.getX() + ", " + e.getY() + ")");
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse entró en el panel.");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse salió del panel.");
            }
        });
        
        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("Mouse movido a: (" + e.getX() + ", " + e.getY() + ")");
            }
            
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("Mouse arrastrado a: (" + e.getX() + ", " + e.getY() + ")");
            }
        });
    }
    
    public static void main(String[] args) {
        new MouseEvents();
    }
    
}
