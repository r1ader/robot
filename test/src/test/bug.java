package test;

import java.io.*;
import java.awt.*;
import test.free;
import test.ImageFind;
import java.util.*;

public class bug {

    public static void main(String[] artgs) {
        free a = new free();
        a.clk(1100,300);
        while(true){
            a.clk(1663,15);
            a.moto(1769,89);
            a.cdown();
            a.moto(1759,219);
            a.cup();
            a.clk(1715,277);
            a.dely(8000);
            a.say('E',500);
            a.say('J',500);
            
            a.say('I',5000);
            a.say('T',2000);
            
            
        }
        

    }

}
