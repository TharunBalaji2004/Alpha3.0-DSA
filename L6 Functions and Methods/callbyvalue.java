import java.util.*;

public class callbyvalue {
    public static void swap(int a,int b){  
        // Swap
        int temp = a;
        a = b;
        b = temp;

        // After swap
        System.out.println("Inside method");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main(String[] args) {
        // Two variables
        int a = 10;
        int b = 5;

        swap(a,b);  // A copy of variables a,b only is passed to swap() method

        System.out.println("Inside main method");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
}

/*
OUTPUT

Inside method
a = 5
b = 10
Inside main method
a = 10
b = 5
*/