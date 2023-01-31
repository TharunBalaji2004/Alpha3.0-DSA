import java.util.Scanner;

public class StringsIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using .next() - takes only one word
        String name = sc.next();
        System.out.println(name);

        // Using .nextLine() - takes the entire sentence
        String fullname = sc.nextLine();
        System.out.println(fullname);
    }
}
