// Question 3 : Enter cost of 3 items from user and find the total bill and add 18% GST tax

import java.io.*;
import java.util.*;

public class pq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil,pen,eraser,total;
        
        System.out.print("Enter price of a Pencil: ");
        pencil = sc.nextFloat();

        System.out.print("Enter price of a Pen: ");
        pen = sc.nextFloat();

        System.out.print("Enter price of a Eraser: ");
        eraser = sc.nextFloat();

        total = pencil + pen + eraser;
        total = total + 0.18f*total;

        System.out.println("Total Bill including 18% gst: " + total);
    }
}
