package test;

import java.io.*;
import test.free;
public class Test2 {

    public static void main(String[] args) {
       for(int i=0;i<10;i++)
       {
           System.out.println(10-i);
           free ad=new free();
           ad.dely(1000);
       }
    }

}
