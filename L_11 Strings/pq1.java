import java.util.Scanner;

public class pq1 {
    public static boolean isLowerCaseVowel(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String s = sc.nextLine();

        int count = 0;
        for(int i=0;i<s.length();i++){
            if (isLowerCaseVowel(s.charAt(i))){
                count++;
            }
        }

        System.out.println("Lowercase vowels occured in " + s + " = " + count);
    }
}

/*
OUTPUT:
Enter a String: aeiou
Lowercase vowels occured in aeiou = 5
Enter a String: AEIOU
Lowercase vowels occured in AEIOU = 0
*/