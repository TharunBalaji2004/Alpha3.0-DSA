import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Performs Multiplication of Bits
        System.out.println("AND Operation(&): " + (a&b));
        // Performs Addition of Bits
        System.out.println("OR Operation(|): " + (a|b));
        // When both bits are same, returns 0
        System.out.println("XOR Operation(^): " + (a^b));
        // Returns 1's complement, ~a = -(a+1)
        System.out.println("Bitwise Complement(~) of " + a + ": " + (~a));
        // Shifts bits towards left side
        System.out.println("Binary Left Shift(<<): " + (a<<b));
        // Shifts bits towards right side
        System.out.println("Binary Right Shift(>>): " + (a>>b));
    }
}

/*
OUTPUT:
Enter first number: 3
Enter second number: 2
AND Operation(&): 2
OR Operation(|): 3
XOR Operation(^): 1
Bitwise Complement(~) of 3: -4
Binary Left Shift(<<): 12
Binary Right Shift(>>): 0

*/