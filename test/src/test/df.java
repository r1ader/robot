/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author r1aderi
 */
public class df {
     public static void main(String[] args) {
        free a=new free();
        a.clk(1100,300);
        int k=0;
        int tm=700;
        while(k!=-1){
            k++;
//l
//            if(k%60==0)
//            {
//                a.say('R',300);
//                a.dely(20000);
//                a.say('R',300);
//                a.dely(5000);
//            }
//            a.say('I',100);
//            a.say('W',300);
//            a.say('A',600);
//            a.dely(500);
//            a.say('L',100);
//            a.say('W',300);
//            a.say('A',600);
//            a.dely(500);
//            a.say('K',100);
//            a.say('W',300);
//            a.say('A',600);
//            a.dely(500);
//            
//            a.say('J',100);
//            a.say('W',300);
//            a.say('A',600);
//            a.dely(500);
                
            a.say('Q', 200);
            
            
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
            a.down('W');
            a.say('K', 200);
//            a.say2('J', 'K', 1000);
            a.up('W');
            a.say('L', 2000);
            a.say('I', 2000);
            a.say('K', 1000);
            a.say('J', 3000);
            
            a.say('D', 300);
            a.dely(500);
            
            
            a.say('I', 100);
            a.say('W',tm);
            a.dely(400);
            a.say('J', 100);
            a.say('W',tm);
            a.dely(400);
            a.say('K', 100);
            a.say('W',tm);
            a.dely(400);
            a.say('I', 100);
            a.say('W',tm);
            a.dely(400);
            a.say('J', 100);
            a.say('W',tm);
            a.dely(400);
            a.say('K', 100);
            a.say('W',tm);
            a.dely(400);
            a.say('L', 100);
            a.say('W',1000);
            a.dely(400);
            
            a.clk(1100, 300);
            a.say('L', 2000);
            a.say('D', 300);
            a.say('L', 600);
            a.say('Q', 400);
            a.say('I', 2100);
            a.say('L', 2100);
            
            
//            a.down('W');
//            a.say2('J', 'K', 1000);
//            a.up('W');
//            a.dely(1000);
            a.say('K', 1500);
            a.say('D', 300);
            a.dely(500);
            a.say2('K', 'L', 100);
            a.say('W',tm);
            a.dely(400);
            a.say2('J', 'K', 100);
            a.say('W',tm);
            a.dely(400);
            a.say2('K', 'L', 100);
            a.say('W',tm);
            a.dely(400);
            a.say2('J', 'K', 100);
            a.say('W',tm);
            a.dely(400);
            a.say('I', 100);
            a.say('W',tm);
            a.dely(400);
            
            a.clk(1100, 300);
            a.say('I', 1000);
            a.say('D', 300);
            a.say('I', 1200);
            
        }
    }
}
