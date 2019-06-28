/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import movimento.carlinhos;

/**
 *
 * @author Maycon Jhonattan
 */
public class telainicial extends JFrame {

    private JButton botaojogar;

    public telainicial() throws InterruptedException {
        ImageIcon imgtela = new ImageIcon(getClass().getResource("imagentelainicial.jpg"));
        JLabel telabonita = new JLabel(imgtela);
        botaojogar = new JButton("PRESS HERE TO START");
        telabonita.setBounds(0, 0, 512, 384);
        botaojogar.setBounds(150, 200, 200, 50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(botaojogar);
        add(telabonita);
        setSize(513, 385);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        botaojogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carlinhos frame = new carlinhos();

                frame.setVisible(true);
            }
        });

        for (int i = 0; i < 255; i++) {

            //define a proxima cor aleatoria
            int cor1 = (int) (Math.random() * 255) + 1;

            //deveria gerar o atraso de 0,3s
            Thread.sleep(300);

            botaojogar.setBackground(new Color(cor1, 00, 00));

        }

    }

}
