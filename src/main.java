import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        custmerlist faq = new custmerlist();
        while (true) {
            System.out.println("input your option");
            System.out.println("1.add");
            System.out.println("2.delete");
            System.out.println("3.fin");
            System.out.println("4.show");
            System.out.println("5.change");
            System.out.println("6.gg");
            int x = sc.nextInt();
            if(x == 1) {
                System.out.println("please input name ,age ,email ,sex");
                faq.add(sc.next(),sc.nextInt(),sc.next(),sc.next());
            }
            if(x == 2) {
                System.out.println("please input index");
                int y = sc.nextInt();
                if(faq.delete(y))
                    System.out.println("delete successfully");
                else
                    System.out.println("error index");
            }
            if(x == 3) {
                System.out.println("please inout index");
                int y = sc.nextInt();
                faq.fin(y);
            }
            if(x == 4) {
                faq.show();
            }
            if(x == 5) {
                System.out.println("please input index");
                int y = sc.nextInt();
                if(faq.change(y,sc.next(),sc.nextInt(),sc.next(),sc.next()))
                    System.out.println("change successfully");
                else System.out.println("error index");
            }
            if(x == 6) {
                System.exit(0);
            }
        }
    }
}
