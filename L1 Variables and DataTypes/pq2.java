// Question 2 : Find the Area of a Square
import java.io.*;
import java.util.*;

public class pq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter side of square: ");
        int side = sc.nextInt();

        int area = side * side;

        System.out.print("Area of Square: " + area);
    }
}
