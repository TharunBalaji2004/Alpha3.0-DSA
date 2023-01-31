import java.util.Scanner;

public class StringCompression {
    public static String compress(String s){
        StringBuilder sb = new StringBuilder();

        for (int i=0;i<s.length();i++){
            Integer count = 1;
            while (i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(s.charAt(i));
            if (count > 1){
                sb.append(count.toString());
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String s = sc.nextLine();

        String res = compress(s);

        System.out.print("Compressed String: ");
        System.out.println(res);
    }
}

/*
OUTPUT:
Enter a String: aaabbcccdd
Compressed String: a3b2c3d2
Enter a String: abccdd
Compressed String: abc2d2
*/