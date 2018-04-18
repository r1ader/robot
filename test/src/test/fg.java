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
public class fg {
    public static void main(String[] args) {
        free a = new free();
        a.clk(1100,300);
        int k=0;
        while(k++!=-1)
        {
            
            a.say('K',2500);
            for(int i=0;i<2;i++)
            {
                a.dely(1000);
                System.out.println(i);
                a.say('F',2000);
                a.say('W',2000);
                a.dely(700);
                a.say('I',400);
                a.say('K',100);
                for(int j=0;j<4;j++)
                    a.say('S',1000);
            }
            a.say('I',1000);
            a.say('J',6000);
            a.say('L',3000);
            a.say('I',3000);
            a.say('K',3000);
            a.say('I',3000);
            int x=880;
            int y=-150;
            a.clk(689+x,777+y);
            a.dely(2000);
            a.clk2(650+x, 281+y);
            a.clk(863, 584);
            a.clk(425+x,173+y);
            a.clk(863, 584);
        }
    }
}
