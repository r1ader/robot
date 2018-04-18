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
public class rygg {
    public static void main(String[] args) {
        free a = new free();
        a.clk(1100,300);
        int k=0;
        while(k++!=-1)
        {
            if(k%10==0)
            {
                a.dely(2000);
                a.say('R',200);
                a.dely(20000);
                a.say('E',200);
                a.dely(1000);
                a.say('E',200);
                a.dely(2000);
            }
            for(int i=0;i<2;i++)
            {
            a.say2('I','L',100);
            a.say('S',5000);
            a.dely(1000);
            
            a.say2('J','K',100);
            a.say('S',5000);
            a.dely(1000);
            
            a.say('F',2000);
            a.say('W',2000);
            a.dely(1000);
            
            if(i==1) continue;
            a.say2('I','L',3000);
            a.say2('J','K',4400);
            a.say2('I','L',1800);
            
            
            }
            
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
