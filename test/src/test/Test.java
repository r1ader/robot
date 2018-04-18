package test;

import java.io.*;
import java.awt.*;
import test.free;
import test.ImageFind;
import java.util.*;

public class Test {

    static void mv(int x, int y) {
        free rob = new free();
        rob.moto(971 + x, 505 + y);
    }

    public static void main(String[] args) {
        int a = 0;
        free rob = new free();
        Date tm = new Date();
        int start = tm.getSeconds();
        int time = 3000;
        while (a<=time) {
//            a++;
            ImageFind imF = new ImageFind("D://img//xie.png");
            int x = imF.getPosX();
            int y = imF.getPosY();
//                int x=938;
//                int y=415;a
            if (x > 800 && y > 400) {
                System.out.println(x+" "+y);
                int x1=938-x;
                int y1=455-y;
                if(Math.abs(x1)>3&&Math.abs(y1)>3)
                mv(-x1,-y1);
            }
        }
        tm = new Date();
        int end = tm.getSeconds();
            if(end - start!=0)
                 System.out.println(time / (end - start));
        }

    }
