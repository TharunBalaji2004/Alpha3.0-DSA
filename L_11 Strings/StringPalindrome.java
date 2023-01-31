import java.util.Scanner;

public class StringPalindrome {
    public static boolean isPalindrome(String s){
        int length = s.length();

        for(int i=0;i<=length/2;i++){
            if (s.charAt(i) != s.charAt(length-i-1))
                return false;    
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        if (isPalindrome(s)){
            System.out.println(s + " is a Palindrome");
        }
        else {
            System.out.println(s + " is not a Palindrome");
        }
    }
}

/*
tc: O(N)

Enter a string: MALAYALAM
MALAYALAM is a Palindrome
*/