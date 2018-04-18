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
public class hongx {

    public static void main(String[] args) {
        free a = new free();
        a.clk(1100, 300);
        int tm = 0;
        while (tm != -1) {
            tm++;
            for (int i = 0; i < 2; i++) {
                a.say('T',3500);
                a.say('L',3000);
//                a.say('T',2000);
                a.say('T',3500);
                a.say('I',500);
                a.say('J',1000);
                a.say('I',500);
                a.say('J',500);
            }
            a.say('T', 2000);
            a.dely(2000);
            int x = 880;
            int y = -150;
            a.clk(689 + x, 783 + y);
            a.dely(2000);
            a.clk2(650 + x, 281 + y);
            a.clk(863, 584);
            a.clk2(710 + x, 281 + y);
            a.clk(863, 584);
            a.clk(425 + x, 173 + y);
            a.clk(863, 584);
        }
    }
}
