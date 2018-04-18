/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class free {
    
    static int dl=300;
    
    static void setdl(int tm) {
        dl=tm;
    }
    
    static void dely(int tm) {
        try {
            Thread.currentThread().sleep(tm);
        } catch (Exception e) {
        }
    }

    static void clk(int x, int y) {
        try {
            Robot myRobot = new Robot();
            myRobot.setAutoDelay(dl);
            myRobot.mouseMove(x, y);
            myRobot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
            myRobot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    static void clk2(int x, int y) {
        try {
            Robot myRobot = new Robot();
            myRobot.setAutoDelay(dl);
            myRobot.mouseMove(x, y);
            myRobot.mousePress(KeyEvent.BUTTON3_DOWN_MASK);
            myRobot.mouseRelease(KeyEvent.BUTTON3_DOWN_MASK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    static void cdown() {
        try {
            Robot myRobot = new Robot();
            myRobot.setAutoDelay(dl);
            myRobot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
//            myRobot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    
     static void cup() {
        try {
            Robot myRobot = new Robot();
            myRobot.setAutoDelay(dl);
//            myRobot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
            myRobot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    static void say(char a, int tm) {
        try {
            Robot myRobot = new Robot();
            myRobot.setAutoDelay(10);
//            System.out.println(a);
            myRobot.keyPress(a - 'A' + 65);
            if (tm != 0) {
                dely(tm);
            }
            myRobot.keyRelease(a - 'A' + 65);

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    
    static void num(int a, int tm) {
        try {
            Robot myRobot = new Robot();
            myRobot.setAutoDelay(10);
//            System.out.println(a);
            myRobot.keyPress(KeyEvent.VK_0+a);
            if (tm != 0) {
                dely(tm);
            }
            myRobot.keyRelease(KeyEvent.VK_0+a);

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    
    static void say2(char a,char b, int tm) {
        try {
            Robot myRobot = new Robot();
            myRobot.setAutoDelay(10);
            myRobot.keyPress(a - 'A' + 65);
            myRobot.keyPress(b - 'A' + 65);
            if (tm != 0) {
                dely(tm);
            }
            myRobot.keyRelease(a - 'A' + 65);
            myRobot.keyRelease(b - 'A' + 65);

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    
    static void space(int tm) {
        try {
            Robot myRobot = new Robot();
            myRobot.setAutoDelay(10);
            myRobot.keyPress(KeyEvent.VK_SPACE);
            if (tm != 0) {
                dely(tm);
            }
            myRobot.keyRelease(KeyEvent.VK_SPACE);

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    static void fz() {
        try {
            Robot myRobot = new Robot();
            myRobot.setAutoDelay(100);
            myRobot.keyPress(KeyEvent.VK_CONTROL);
            myRobot.keyPress(KeyEvent.VK_V);
            myRobot.keyRelease(KeyEvent.VK_V);
            myRobot.keyRelease(KeyEvent.VK_CONTROL);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    
    static void entr(int tm) {
        try {
            Robot myRobot = new Robot();
            myRobot.setAutoDelay(10);
            myRobot.keyPress(KeyEvent.VK_ENTER);
            if (tm != 0) {
                dely(tm);
            }
            myRobot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    
     static void down(char a) {
        try {
            Robot myRobot = new Robot();
            myRobot.setAutoDelay(10);
//            System.out.println(a);
            myRobot.keyPress(a - 'A' + 65);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
     
     static void up(char a) {
        try {
            Robot myRobot = new Robot();
            myRobot.setAutoDelay(10);
//            System.out.println(a);
            myRobot.keyRelease(a - 'A' + 65);
            
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
     
     static void moto(int x,int y) {
        try {
            Robot myRobot = new Robot();
            myRobot.setAutoDelay(10);
            myRobot.mouseMove(x, y);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    
}
