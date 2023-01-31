import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();

        // Using .length() method to calculate length of string
        int len = name.length();
        System.out.println("Length of name: " + len);

        // Concatenation of Strings
        String firstname = name;
        String surname = "Joseph";
        String fullname = firstname + " " + surname;
        System.out.println(fullname);

        // .charAt(<index>) method - returns the character at index of string
        char ch = name.charAt(0);
        System.out.println("First character in name: " + ch);

        // Comparing Two Strings ('=' operator should not be used)
        String s1 = "Sam";
        String s2 = new String("Sam");
        if (s1.equals(s2)){
            System.out.println("Strings are Equal");
        }
        else {
            System.out.println("Strings are not Equal");
        }

        // .substring(<start>,<end>) - returns the substring from start to end-1 index
        String subname = name.substring(0, 2);
        System.out.println(subname);

        // <s1>.compareTo(<s2>) - compares two strings lexicographically
        // <s1>.compareToIgnoreCase(<s2>) - ignores character case
        // returns 0 = s1 equals s2 , +ve = s1 > s2, -ve = s1 < s2
        String fruit1 = "apple";
        String fruit2 = "banana";
        if (fruit1.compareTo(fruit2) > 0){
            System.out.println(fruit1 + " is largest");
        }
        else {
            System.out.println(fruit2 + " is largest");
        }
    }
}

/*
OUTPUT:
Enter a name: Sam
Length of name: 3
Sam Joseph
First character in name: S
Strings are Equal
Sa
banana is largest
*/