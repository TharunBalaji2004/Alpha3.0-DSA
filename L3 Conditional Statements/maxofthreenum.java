import java.util.*;

public class maxofthreenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c){
            System.out.println(a + " is largest");
        }
        else if (b > c){
            System.out.println(b + " is largest");
        }
        else{
            System.out.println(c + " is largest");
        }
    }
}

/*
Checks conditions that a>b and a>c
- If true, return a 
- If false, then a must be lesser than b or c

Check if b>c
- If true, return b
- If false, return c
*/