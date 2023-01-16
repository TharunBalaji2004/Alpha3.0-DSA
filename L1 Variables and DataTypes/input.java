import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String input
        String input = sc.nextLine();
        System.out.println(input);

        // Character input
        char ch = sc.next().charAt(0);
        System.out.println(ch);

        // Integer input
        int number = sc.nextInt();
        System.out.println(number);

        // Float input
        float price = sc.nextFloat();
        System.out.println(price);
    }
}
