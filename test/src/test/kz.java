package test;

public class kz {

    public static void main(String[] args) {
        free a = new free();
        a.clk(1100, 300);
        while (true) {
            int tm = 10000;
            int tm2 = 1000;
//            a.clk(1100, 280);
//            a.clk(1030, 280);
//            a.clk(960, 280);
            a.say('I',600);
            a.say('D',1000);
            a.say('I',3000);
            a.say('W',3000);
            for (int i = 0; i < 5; i++) {
//                a.clk2(1530, 430);
//                a.clk2(1580, 430);
//                a.clk(300,490);
                
//                a.clk(300,490);
                a.clk(1100, 300);
                System.out.println(i); 
                a.clk(100, 280);
                a.say2('I', 'L', tm2);
                a.say('D',200);
                a.down('I');
                a.down('L');
                a.dely(800);
                a.say('C', 1000);
                a.up('I');
                a.up('L');
                a.down('W');
                a.say2('I', 'L', tm);
                a.up('W');

             
                a.say2('I', 'J', tm2);
                a.say('D',200);
                a.down('I');
                a.down('J');
                a.dely(800);
                a.say('C', 1000);
                a.up('I');
                a.up('J');
                a.down('W');
                a.say2('J', 'I', tm);
                a.up('W');


                a.say2('J', 'K', tm2);
                a.say('D',200);
                a.down('J');
                a.down('K');
                a.dely(800);
                a.say('C', 1000);
                a.up('J');
                a.up('K');
                a.down('W');
                a.say2('K', 'J', tm);
                a.up('W');

                a.say2('K', 'L', tm2);
                a.say('D',200);
                a.down('K');
                a.down('L');
                a.dely(800);
                a.say('C', 1000);
                a.up('K');
                a.up('L');
                a.down('W');
                a.say2('L', 'K', tm);
                a.up('W');
            }
        }
    }
}
