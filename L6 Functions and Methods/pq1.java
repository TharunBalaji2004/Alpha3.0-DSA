import java.util.Scanner;

public class pq1 {
    public static float average(float a, float b, float c){
        return (float)(a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter second number: ");
        float b = sc.nextFloat();
        System.out.print("Enter third number: ");
        float c = sc.nextFloat();

        float ans = average(a, b, c);
        System.out.println("Average of three numbers is "+ans);
    }
}

/*
OUTPUT:
Enter first number: 15
Enter second number: 20
Enter third number: 43
Average of three numbers is 26.0
*/