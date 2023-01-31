import java.util.HashMap;
import java.util.Scanner;

public class pq4_HashMap {
    public static boolean isAnagram(String s1,String s2){
        HashMap<Character,Long> map1 = new HashMap<>();
        HashMap<Character,Long> map2 = new HashMap<>();
        
        int n1 = s1.length();
        int n2 = s2.length();

        if (n1 != n2) return false;
        
        for(int i=0;i<n1;i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if (map1.containsKey(ch1)){
                long count1 = map1.get(ch1) + 1;
                map1.put(ch1,count1);
            }
            else {
                map1.put(ch1,(long) 1);
            }

            if (map2.containsKey(ch2)){
                long count2 = map2.get(ch2) + 1;
                map2.put(ch2,count2);
            }
            else {
                map2.put(ch2, (long) 1);
            }
        }        

        if (map1.equals(map2)) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first String: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second String: ");
        String s2 = sc.nextLine();

        if (isAnagram(s1, s2)){
            System.out.println("Both Strings are anagrams");
        }
        else {
            System.out.println("Both Strings are not anagrams");
        }
    }
}
