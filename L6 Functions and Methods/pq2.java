import java.util.Scanner;

public class pq2 {
    public static boolean isEven(int num){
        if (num%2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isEven(num)){
            System.out.println(num + " is a Even number");
        }
        else {
            System.out.println(num + " is a Odd number");
        }
    }
}

/*
OUTPUT:

Enter a number: 6
6 is a Even number

Enter a number: 9
9 is a Even number
*/