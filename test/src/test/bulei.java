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
public class bulei {
      public static void main(String[] args) {
        free a = new free();
        a.clk(1100, 300);
        int tm=500*2;
        int b=0;
          System.out.println("asdfa");
        while (b++!=-1) {
//            a.say('A',tm);
//            a.say('K',1500);
//            a.say2('K','J',200);
//            a.say('W',tm);
//            a.say('L',500);
//            a.say('A',2*tm);
//            a.say('L',1000);
//            a.say('W',tm);
//            a.say('L',1100);
//            a.say('A',tm);
//            
//            a.say('J',500);WDI
//            a.say('I',1300);
//            a.say('J',900);
//            a.say('D',300);
//            a.say('I',3000);
//            a.say('K',200);
//            a.say('A',2*tm);
//            a.say('W',2*tm);
//            a.dely(4000);
//            a.dely(12000);

            for(int i=0;i<4;i++)
            {
                
                a.say('L',2200);
                a.say('W',500);
                a.say('D',200);
            }
            for(int i=0;i<6;i++)
            {
                a.clk(1100, 300);
                a.say('I',2600);
                a.say('W',500);
                a.say('D',200);
            }
            
//            a.say('E',300);
            int x=880;
            int y=-150;
            a.clk(689+x,783+y);
            a.dely(2000);
            a.clk2(650+x, 281+y);
            a.clk(863, 584);
            a.clk(425+x,173+y);
            a.clk(863, 584);
//            if(b%20==19){
//                a.say('E',300);
//                a.say('K',20000);
//                a.say('E',300);
//                a.dely(6000);
//            }
        }

    }
}
