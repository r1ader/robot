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
public class diaoyu {
    public static void main(String[] args) {
        free a = new free();
        a.clk(1100,300); 
        int i=0;
        while(i++!=-1)
        {
            if(i%2000==1) 
                a.say('R',100);
            a.space(100);
            a.dely(600);          
        }  
    }
}
