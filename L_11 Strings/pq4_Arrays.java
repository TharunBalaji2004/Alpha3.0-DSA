import java.util.*;

public class pq4_Arrays {
    public static boolean isAnagram(String s, String t) {
        char[] arr_s = s.toCharArray();
        char[] arr_t = t.toCharArray();

        Arrays.sort(arr_s);
        Arrays.sort(arr_t);

        if (Arrays.equals(arr_s,arr_t))
            return true;
            
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first String: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second String: ");
        String s2 = sc.nextLine();

        if (isAnagram(s1, s2)){
            System.out.println("Both Strings are Anagrams");
        }
        else {
            System.out.println("Both Strings are not Anagrams");
        }
    }
}

/*
OUTPUT:
Enter first String: care
Enter second String: race
Both Strings are Anagrams
*/