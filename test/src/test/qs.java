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
public class qs {
    public static void main(String[] args) {
        free a=new free();
        a.clk(1100,300);
        int f=0;
        while(f!=-1){
            f++;
            System.out.println(f);
            if(f%10==0)
            {
                a.dely(2000);
                a.say('R',200);
                a.dely(20000);
                a.say('E',200);
                a.dely(1000);
                a.say('E',200);
                a.dely(2000);
            }
            a.down('W');
            a.say('L',2000);
            a.say('I',4000);
            a.say('L',2000);
            
            a.say2('K','J',900);
//            a.say('S',1000);
            
            a.say('K',2000);
            a.say2('L','K',2000);
//            a.say('S',1000);
            a.down('W');
            a.say('J',3000);
//            a.say('S',1000);
            
            a.say2('I','J',3000);
            a.say('I',800);
            
//            a.say2('I','J',1000);
            a.say('J',2500);
//            a.say('S',1000);
            a.down('W');
            a.say2('I','L',3500);
//            a.say('S',1000);
            a.down('W');
            a.say('K',2500);
             a.say('L',3500);
             a.up('W');
             a.dely(1000);
        }
    }
}
