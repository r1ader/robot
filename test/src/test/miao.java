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
public class miao {
    
    public static void main(String[] args) {
        free a = new free();
        a.setdl(100);
        a.clk(1100, 300);
        a.dely(5000);
        int tm=0;
        while (tm++!=-1) {
            a.clk(1100, 300);
            a.entr(50);
            a.clk(1100, 300);
            a.entr(50);
            a.clk(1100, 300);
            a.entr(50);
            
            
            if(tm%60==0)
                a.dely(5000);
        }

    }
}

