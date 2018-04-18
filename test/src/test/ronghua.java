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
public class ronghua {
    public static void main(String[] args) {
        free a = new free();
        a.clk(1100, 300);
        a.setdl(10);
        int tm = 0;
        while (tm != -1) {
            a.say('I',1000);
            a.down('W');
            a.say('K',1000);
            a.clk(1100, 300);
            a.say('L',3000);
            a.clk(1100, 300);
            a.say('I',1000);
            a.clk(1100, 300);
            a.say('L',4000);
            a.clk(1100, 300);
            a.say('J',6000);
            a.clk(1100, 300);
            a.up('W');
        }
    }
}
