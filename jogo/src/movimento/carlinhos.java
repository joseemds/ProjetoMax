/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movimento;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import jogo.Paralelo;

/**
 *
 * @author Maycon Jhonattan
 */
public class carlinhos extends JFrame {

    public static int x = 0;
    public static int y = 650;
    public static JLabel megaman;

    public static void mudar(int x, int y) {
        megaman.setBounds(x, y, 80, 30);
    }

    public carlinhos() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1300, 779);
        ImageIcon img = new ImageIcon(getClass().getResource("10.png"));
        ImageIcon img2 = new ImageIcon(getClass().getResource("espaco1.jpg"));
        megaman = new JLabel(img);
        JLabel cenario = new JLabel(img2);
        JLabel ImageTeste = new JLabel();
        cenario.setBounds(0, 0, 1300, 779);
        megaman.setBounds(x, y, 30, 40);
        add(megaman);
        add(cenario);
        setLocationRelativeTo(null);
        setResizable(false);

        // Thread t1 = new Thread(new Paralelo ());
        // t1.start();
        System.out.println("abc");

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(y);
                int i = 4;
                if (e.getKeyCode() == 39) {
                    x += 21;
                    if (x >= 1240) {
                        x = 1240;
                    }
                    if (x % 2 == 0) {
                        megaman.setIcon(new ImageIcon(getClass().getResource("10.png")));
                    } else {
                        megaman.setIcon(new ImageIcon(getClass().getResource("5.png")));
                    }

                }
                if (e.getKeyCode() == 37) {
                    if (x > -20) {
                        x -= 21;
                        if (x % 2 == 0) {
                            megaman.setIcon(new ImageIcon(getClass().getResource("decosta1.png")));
                        } else {
                            megaman.setIcon(new ImageIcon(getClass().getResource("decosta2.png")));
                        }

                    }
                }
                if (e.getKeyCode() == 38) {
                    //y -= 10;
                    Multi t1 = new Multi();
                    t1.start();
                   
                        
                    }
                
//                if (e.getKeyCode() == 40) {
                //y += 10;'
//                }
                megaman.setBounds(x, y, 80, 30);
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        setVisible(true);
    }


    class Multi extends Thread {

        public void run() {
            for (int i = 0; i < 15; i++) {
                y -= 10;
                megaman.setBounds(x, y, 80, 30);
                System.out.println("Y: " + y);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(carlinhos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            for (int i = 0; i < 15; i++) {
                y += 10;
                megaman.setBounds(x, y, 80, 30);
                System.out.println("Y: " + y);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(carlinhos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

}
