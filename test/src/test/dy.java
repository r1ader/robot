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
public class dy {

    public static void main(String[] args) {
        free a = new free();
        a.clk(1100, 300);
        int tm = 200;
        a.setdl(10);
        int f=0;
        while (true) {
            f++;
//            a.space(900);        
//            a.say2('K','L',400);
//            a.dely(80);  
//            a.space(900);         
//            a.say2('I','J',400);
//            a.dely(80);
//             
//            a.space(900);        
//            a.say2('K', 'J',700);
//            a.dely(80);  
//            a.space(900);         
//            a.say2('I','L',700);
//            a.dely(80);      

//            a.space(900);           
//            a.say('L',560);      
//            a.dely(80);   
//            a.space(900);         
//            a.say('J',560);
//            a.dely(80);
//            
//            a.space(100);  
//            a.dely(200);
            
            a.say('Q', 200);
            
            a.down('W');
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
            a.say2('J', 'K', 1000);
            a.up('W');
            a.say('L', 2000);
            a.say('I', 2000);
            a.say('K', 1000);
            a.say('J', 3000);
            
            a.say('D', 300);
            a.dely(500);
            a.down('W');
            a.dely(100);
            
            a.say('I', 1000);
            a.say('J', 1000);
            a.say('K', 1000);
            a.say('I', 1000);
            a.say('J', 1000);
            a.say('K', 1000);
            a.say('L', 1000);
//            a.say2('I','J',1000);         
//            a.say2('J','K',1000);
//            a.say2('I','J',1000);
//        ^    a.say2('J','K',1000);
            a.up('W');
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
            a.down('W');
            a.dely(100);
            a.say2('K', 'L', 1200);
            a.say2('J', 'K', 1200);
            a.say2('K', 'L', 1200);
            a.say2('J', 'K', 1200);
            a.say('I', 1000);
            a.up('W');
            a.clk(1100, 300);
            a.say('I', 1000);
            a.say('D', 300);
            a.say('I', 1200);
            
        }
    }
}
