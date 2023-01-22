import java.util.*;

public class methodswithparam {
    public static int calculateSum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("Sum is: "+ sum);
    }   
}

/*
    Methods with Parmeters
    
    <return type> name (<type> param1, <type> param2){
        // body
        return <statement>
    }

    Paramteres - Values declared in function definition statement
    Arguments - Values declared in function call statement
*/