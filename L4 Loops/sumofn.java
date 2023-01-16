import java.util.*;

public class sumofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int sum = 0;
        int counter = 1;
        
        while (counter <= n){
            sum += counter;
            counter++;
        }

        System.out.print("Sum of "+n+" numbers is "+sum);
    }
}
