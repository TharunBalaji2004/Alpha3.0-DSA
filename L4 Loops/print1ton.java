import java.util.*;

public class print1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int counter = 1;
        
        while (counter <= n){
            System.out.print(counter + " ");
            counter++;
        }
        
    }
}
