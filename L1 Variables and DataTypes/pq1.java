// Question 1 : Find the average of numbers A,B,C

import java.io.*;
import java.util.*;

public class pq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,total;
        float avg;

        System.out.print("Enter value of A: ");
        a = sc.nextInt();
        System.out.print("Enter value of B: ");
        b = sc.nextInt();
        System.out.print("Enter value of C: ");
        c = sc.nextInt();

        total = a + b + c;
        avg = total/3;

        System.out.println("Average of three numbers: " + avg);
    }
}
