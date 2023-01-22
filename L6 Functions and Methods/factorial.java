import java.util.*;

public class factorial {
    public static int factorial(int num){
        int f = 1;

        for(int i=1;i<=num;i++){
            f = f*i;
        }

        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int ans = factorial(n);

        System.out.println("Factorial of "+n+" is "+ans);
        
    }
}
