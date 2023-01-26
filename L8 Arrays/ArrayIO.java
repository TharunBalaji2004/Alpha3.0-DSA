import java.util.Scanner;

public class ArrayIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[100];

        System.out.print("Enter Physics marks: ");
        marks[0] = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        marks[1] = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        marks[2] = sc.nextInt();

        System.out.println("Length of array: " + marks.length);
        
    }
}
