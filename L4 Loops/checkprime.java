import java.util.*;

public class checkprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        // APPROACH 1 - TC: O(N)
        for(int i=2; i <= num-1;i++){
            if (num%i == 0){
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            System.out.println(num + " is a prime number");
        }
        else {
            System.out.println(num + " is not a prime number");
        }

        isPrime = true;
        // APPROACH 2 - TC: O(√N)
        for(int i=2; i<= Math.sqrt(num);i++){
            if (num%i == 0){
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            System.out.println(num + " is a prime number");
        }
        else {
            System.out.println(num + " is not a prime number");
        }
    }
}

/*
CHECK IF A NUMBER IS PRIME OR NOT
Prime Number - A Number which is divisible by 1 and itself

APPROACH 1 : TC - O(N) - Naive Approach
Iterating from 2 to N-1, if any number is divisible within this range, then it is not a prime number

APPROACH 2 : TC - O(√N) - Optimized Approach
Iterating from 2 to √N, if any number is divisible within this tange, then it is not a prime number
*/