/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author r1ader
 */
public class na {

    public static void main(String[] args) {
        free a = new free();
        a.setdl(100);
        a.clk(1100,300);  
        a.dely(1000);
        for (int i = 0; i < 4; i++) { 
        a.space(200);
        a.dely(1000);
        a.clk(700,980);  
        a.clk(1300,1100); 
        a.clk(1300,1100);
        a.clk(1300,1100);
        a.clk(1300,1100);
        a.clk(1300,1100);
        a.dely(600);
        a.clk(1300,1100);
        a.clk(1300,1100); 
        a.say('R',300);
        a.dely(1000);
        }
    }
}
