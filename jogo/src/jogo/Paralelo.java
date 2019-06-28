/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import movimento.carlinhos;

/**
 *
 * @author Maycon Jhonattan
 */
public class Paralelo implements Runnable{
    @Override
    public void run(){
        while(true) {
            try {
                System.out.println("teste123");
                if(carlinhos.y<650){
                    carlinhos.y+=15;
                    carlinhos.megaman.setBounds(carlinhos.x, carlinhos.y, 30, 40);
                    System.out.println("a "+ carlinhos.y);
                    Thread.sleep(1000);
                }
            }catch (Exception e) {
                e.printStackTrace();

            }
    }
    }
    
}
