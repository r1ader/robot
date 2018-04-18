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
public class diu {

    public static void main(String[] args) {
        free a = new free();
        a.setdl(100);
        a.clk(1100,300);  
        a.dely(1000);
        for (int i = 0; i < 5; i++) { 
            for (int j = 0; j < 6; j++) {
//                a.clk2(1530 + 60 * j, 330 - 60 * i);
                a.moto(1530 + 60 * j, 390 - 60 * i);
               a.cdown();
               a.moto(863, 624);
                a.cup();
                a.clk(863, 624);

//                a.num(9,100);
//                a.num(8,100);
//                a.num(4,100);
//                a.num(4,100);
//                a.clk(1000,500);
//                a.entr(300);
//                a.entr(300);
//                a.dely(300);
//                a.entr(300);
//                a.entr(300);
            }

//        a.space(200);
//        a.dely(1000);
//        a.clk(700,980); 
//        a.clk(1300,1100); 
//        a.clk(1300,1100);
//        a.clk(1300,1100);
//        a.clk(1300,1100);
//        a.clk(1300,1100);
//        a.dely(600);
//        a.clk(1300,1100);
//        a.clk(1300,1100); 
//        a.say('R',300);
//        a.dely(1000);
        }
    }
}
