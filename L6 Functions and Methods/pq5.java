import java.util.Scanner;

public class pq5 {
    public static int digitSum(int num){
        int total = 0;
        while (num > 0){
            int dig = num%10;
            total = total + dig;
            num = num/10;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int ans = digitSum(num);

        System.out.println("Sum of digits in "+num+" is "+ans);
    }
}

/*
OUTPUT:
Enter a number: 564
Sum of digits in 564 is 15
*/
