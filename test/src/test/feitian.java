/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

public class feitian {

    public static void main(String[] args) {
        free a = new free();
        a.clk(1100, 300);
        int tm=200;
        while (true) {
            a.say('W',200);
            a.say('K',2000);
            a.say('J',500);
            a.say('A',1000);
            a.dely(500);
            a.say('L',500);
            
            a.say('K',1000);
            a.say('W',400);
            a.dely(500);
            a.say('L',200);
            a.say('W',500);
            a.say('L',1500);
            a.say('A',1000);
            a.dely(500);
            a.say('J',1700);
            
            a.say('K',1000);
//            a.say('J',500);k
            a.say('A',1000);
//            a.say('L',500);

//            ja
            a.clk(1100,300);
            a.say('I',1500);
            a.say('D',300);
            a.say('I',4000);
            a.say('K',200);
            a.say('W',tm);
            a.say('A',1000);
            a.dely(8000);
            int x=880;
            int y=-150;
            a.clk(689+x,783+y);
            a.dely(2000);
            a.clk2(650+x, 281+y);
            a.clk(863, 584);
            a.clk(425+x,173+y);
            a.clk(863, 584);

        }

    }

}
