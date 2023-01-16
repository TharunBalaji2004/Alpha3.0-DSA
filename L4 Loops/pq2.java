import java.util.*;

public class pq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of integer: ");
        int n = sc.nextInt();

        int even = 0, odd = 0;
    
        for(int i=0;i<n;i++){
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num%2 == 0) even += num;
            else odd += num;
        }

        System.out.println("Sum of even numbers: "+even);
        System.out.println("Sum of odd numbers: "+odd);
    }
}
