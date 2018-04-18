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
public class xp {
    public static void main(String[] args) {
        free a = new free();
        a.clk(1100, 300);
        int b=0;
        while (true) {
            for (int i = 0; i < 14; i++) {
                System.out.println(b);
                b++;
                a.clk(1100, 280);
                a.down('I');
                a.down('L');
                a.say('C',400);
                a.dely(1000);
                
                for(int j=0;j<10;j++)
                {
                    a.dely(1500);
                    a.say('S',600);
                }
                
                a.up('I');
                a.up('L');
                a.dely(1000);
                
                a.say('C',400);
                a.dely(3000);
                a.say('J', 700);
                a.say('I', 2000);
                a.say('S',1300);
                a.say('L', 1400);
//                a.say('W',200);
                a.down('J');
                a.down('K');
                for(int j=0;j<13;j++)
                {
                    a.dely(1200);
                    a.say('S',600);
                }
                a.up('J');
                a.up('K');
            }
        }
    }
}
