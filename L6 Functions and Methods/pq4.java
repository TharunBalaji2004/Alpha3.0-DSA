import java.util.Scanner;

public class pq4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Math.min(a,b) - returns the minimum value among a and b
        System.out.println("Minimum value: " + Math.min(a,b));

        // Math.max(a,b) - returns the maximum value among a and b
        System.out.println("Maximum value: " + Math.max(a, b));

        // Math.sqrt(a) - returns the square root value of a number
        System.out.println("Square root of " + a + " is " + Math.sqrt(a));

        // Math.pow(a,b) - return the value of a^b (a power b)
        System.out.println("Value of a^b: " + Math.pow(a,b));

        // Math.abs(a) - returns the positive value of a
        System.out.println("Absolute value of a: " + Math.abs(a));
    }
}

/*
OUTPUT:

Enter first number: 2
Enter second number: 4
Minimum value: 2
Maximum value: 4
Square root of 2 is 1.4142135623730951
Value of a^b: 16.0
Absolute value of a: 2
*/