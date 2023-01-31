import java.util.Scanner;

public class ConverttoUppercase {
    public static String toUpperCase(String s){
        StringBuilder sb = new StringBuilder();

        char ch = Character.toUpperCase(s.charAt(0));
        sb.append(ch);

        for(int i=1;i<s.length();i++){
            if (s.charAt(i) == ' ' && i < s.length()-1){
                sb.append(" ");
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String line = sc.nextLine();

        String res = toUpperCase(line);
        System.out.println(res);
    }
}

/*
OUTPUT:
Enter a sentence: hi, i am sam
Hi, I Am Sam
 */