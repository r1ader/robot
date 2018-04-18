/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import test.free;
import test.ImageFind;

public class gjs {

    static class t1 implements Runnable {

        public void run() {
            free a = new free();
            while (true) {
                a.down('W');
                a.dely(10);
            }
        }
    }
//
    static void zou(int x, int y) {
        ImageFind me = new ImageFind("D://img//wo.png");
        int x1 = me.getPosX();
        int y1 = me.getPosY();
        free a = new free();
        if (Math.abs(x - x1) < 5 && Math.abs(y - y1) < 5) {
            return;
        }
        if (x > x1) {
            a.say('L', x - x1);
        } else if (x < x1) {
            a.say('J', x1 - x);
        }
        
        if (y > y1) {
            a.say('K', y - y1);
        } else if (y < y1) {
            a.say('I', y1 - y);
        }

    }


    public static void main(String largs[]) {
        ImageFind me = new ImageFind("D://img//zl2.png");
        free a = new free();
        int x = me.getPosX();
        int y = me.getPosY();
        a.moto(x,y);
        System.out.println(x+" "+y);
        
//        int tm = 3000;
//        a.clk(1100, 300);
//        Thread t= new Thread(new t1());
//        int tl=0;
//        t.start();
//        a.dely(1000);
//        while (true) {
//            tl++;
//            System.out.println(tl);
//            for(int i=0;i<15;i++){
//                a.say('I', tm);
//                a.say2('I', 'L', tm);
//                a.say('L', tm);
//                a.say('Q',600);
//                a.say2('K', 'L', tm);
//                a.say2('K', 'J', tm);
//                a.say('J', 700);
//                a.say('F', 800);
//                a.say('J', tm);
//            }
//            a.say('R',400);
//            a.dely(50000);
//            a.say('R',400);
//            a.say('E',400);
//            a.dely(100);
//            a.say('E',400);
//            a.dely(2000);
//            a.up('W');
//            a.say('Q',600);
//            a.dely(2000);
//        }
    }
}
