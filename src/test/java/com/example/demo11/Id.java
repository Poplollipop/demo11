import java.util.Scanner;

public class Id {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pattern = "[A-Za-z&&[^ABDEFHabdefh]][1-2]\\d{8}";
        System.out.println("請輸入身分證字號，共10碼： ");
        String input = scan.next();
        System.out.println(input.matches(pattern));
    }
    // public static void main(String[] args) {
    // Scanner scan = new Scanner(System.in);
    // String pattern = "[[^ABDEFHabdefh0-9_]&&\\w][1-2]\\d{8}";
    // System.out.println("請輸入身分證字號，共10碼： ");
    // String input = scan.next();
    // System.out.println(input.matches(pattern));
    // }
}
