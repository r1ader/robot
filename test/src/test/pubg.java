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
public class pubg {
    public static void main(String[] args) {
        free a = new free();
        a.clk(1400, 300);
        for(int i=0;i<10;i++)
        {
            a.dely(100);
            a.moto(1100+i*800,300);
        }
//        a.moto(1100, 300);
        
    }
}
