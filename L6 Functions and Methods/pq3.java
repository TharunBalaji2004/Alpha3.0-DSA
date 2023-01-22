import java.util.Scanner;

public class pq3 {
    public static boolean isPalindrome(int num){
        int temp = num, rev = 0;

        while (temp > 0){
            int dig = temp%10;
            rev = rev*10 + dig;
            temp = temp/10;
        }

        if (rev == num) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPalindrome(num)){
            System.out.println(num + " is Palindrome");
        }
        else {
            System.out.println(num + " is not Palindrome");
        }
    }
}

/*
OUTPUT:

Enter a number: 121
121 is Palindrome

Enter a number: 123
123 is not Palindrome
*/