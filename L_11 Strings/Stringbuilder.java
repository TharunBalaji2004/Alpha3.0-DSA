public class Stringbuilder {
    public static void main(String[] args) {
        // Directly Create String Builder
        StringBuilder sb1 = new StringBuilder("Sam");
        System.out.println(sb1);
        // Append characters to StringBuilder
        StringBuilder sb2 = new StringBuilder();
        for(char ch='a';ch<='z';ch++){
            sb2.append(ch);
        }
        System.out.println(sb2);
    }
}

/*
OUTPUT:
Sam
abcdefghijklmnopqrstuvwxyz
*/