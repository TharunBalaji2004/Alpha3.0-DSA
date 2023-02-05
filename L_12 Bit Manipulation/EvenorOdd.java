import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int bitMask = 1;
        if ((num & bitMask) == 0)
            System.out.println(num + " is a even number");
        else
            System.out.println(num + " is a odd number");
    }
}

/*
For Even numbers, LSB = 0
For Odd numbers, MSB = 1

LOGIC: When we perform Binary AND(&) with 1, all bits gets changed except LSB
Here, BitMask = 1
*/