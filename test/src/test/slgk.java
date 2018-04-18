package test;

public class slgk {

    static void f(char x, char y) {
        int tm = 2000;
        int tm2 = 800;
        free a = new free();
        a.say('W',2000);
        a.dely(300);
        a.say2(x, y, tm2);
        a.say('D',100);
        a.down(x);
        a.down(y);
        a.dely(200);
        a.say('C', 1000);
        a.up(x);
        a.up(y);
        a.say2(x, y, 100);
        for (int j = 0; j < 5; j++) {
            a.say('R', tm2);
            a.say2(x, y, tm);
        }
    }

    public static void main(String[] args) {
        free a = new free();
//        a.clk(1100, 300);
        while (true) {
            int tm = 1500;
            int tm2 = 1200;
            a.clk(1100, 300);
            a.say('I', 600);
            a.say('D', 100);
            a.say('I', 3000);
            a.dely(200);
            a.say('R', 800);
            for (int i = 0; i < 4; i++) {
                System.out.println(i);
                f('I', 'L');
                f('I', 'J');
                f('J', 'K');
                f('K', 'L');
               
            }
            a.down('L');
                a.down('I');
                a.dely(200);
                a.say('C', 2000);
                a.up('L');
                a.up('I');
                a.dely(10000);
        }
    }
}
