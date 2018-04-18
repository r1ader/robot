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
public class shijia {

    public static void main(String[] args) {
        free a = new free();
        a.clk(1100, 300);
        int tm = 0;
        while (tm!=-1) {
            tm++;
            for (int i = 0; i < 2; i++) {
                a.down('W');
                a.say('J', 2000);
                a.say('I', 2000);
                a.say2('J', 'K', 4000);
                a.say('K', 5000);
                a.say('L',1000);
                a.say('I', 7000);
                a.up('W');
                
            }
//            a.clk(1100, 300);
//            a.say('I', 1500);
//            a.say('D', 300);
//            a.say('I', 4000);
//            a.say('K', 200);
//            a.say('W', tm);
//            a.say('A', 1000);
            a.say('W',2000);
            a.say('Q',6000);
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
            if(tm%5==1)
            {
                a.say('E',100);
            }
        }
    }
}
