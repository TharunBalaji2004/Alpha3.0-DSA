import java.util.Scanner;

public class CheckPowerof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int bitMask = num - 1;
        if ((num & bitMask) == 0)
            System.out.println(num + " is a power of 2");
        else
            System.out.println(num + " is not a power of 2");
    }
}

/*
As we see the powers of 2: 2,4,8,16,...

In Binary System, the numbers which are power of 2 having only single '1' bit
Also,

4 -> 100
3 -> 011
4&3 -> 0

8 -> 1000
7 -> 0111
8&7 -> 0

So, the current number AND(&) with pervious number gives 0. That current number is a power of 2
*/