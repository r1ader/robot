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
public class heartstone {

    static free a = new free();

    static void zhuai(int x1, int y1, int x2, int y2) {
        a.setdl(1);
        a.moto(x1, y1);
        double dx = (x2 - x1) / 15.0;
        double dy = (y2 - y1) / 15.0;
        a.cdown();
        for (int i = 1; i <= 15; i++) {
            a.moto((int) (x1 + i * dx), (int) (y1 + i * dy));
        }
        a.cup();
    }

    public static void main(String[] args) {
//      
//a.dely(2000);
//        a.clk(1830,1050);
//        a.clk(930,400);
//        a.dely(90000);
        int num=0;
        while (true) {
            num++;
            a.clk(961, 655);
            a.dely(300);
            a.clk(1400, 900);
            a.dely(40000);
            a.clk(1000, 850);
            if(num%2==1){
                a.dely(500);
                a.clk(1830,1050);
                a.clk(930,400);
                a.dely(1000);
                a.clk(930,400);
                a.dely(3000);
                a.clk(930,400);
                a.dely(3000);
                a.clk(930,400);
                a.dely(7000);
            }
            for (int j = 0; j < 4; j++) {
                for (int i = 0; i < 7; i++) {
                    zhuai(670 + 100 * i, 1000, 960, 200);
                    a.dely(300);
                }

            }
            for (int i = 0; i < 8; i++) {
                zhuai(480 + 120 * i, 600, 960, 200);
                a.dely(200);
                for (int j = 1; j <= 4; j++) {
                    a.setdl(100);
                    a.clk(670 + 130 * j, 400);
                    a.dely(100);
                }
                a.dely(300);
            }
            a.setdl(100);
            a.clk(1100, 800);
            a.clk(1100, 800);
            zhuai(1000, 800, 960, 200);
            a.dely(200);
            for (int j = 1; j <= 4; j++) {
                a.setdl(100);
                a.clk(670 + 130 * j, 400);
                a.dely(100);
            }
            a.dely(3000);
            a.setdl(100);
            a.clk2(1570, 500);
            a.clk(1570, 500);
            a.clk(1570, 500);
            a.dely(3000);
        }

    }
}
