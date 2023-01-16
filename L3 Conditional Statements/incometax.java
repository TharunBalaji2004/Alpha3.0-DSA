import java.util.*;

public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax; // Default integer type is 0

        if (income < 500000){
            tax = 0;
        }
        else if (income >= 500000 && income < 1000000){
            tax = (int)(income * 0.2);
        }
        else {
            tax = (int) (income * 0.3);
        }

        System.out.println("Estimated Tax: " + tax);
    }
}
