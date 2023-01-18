import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int lines = sc.nextInt();

        for(int i=1;i<=lines;i++){
            for(int gap=1;gap<=lines-i;gap++){
                System.out.print(" ");
            }
            for(int star=1;star<=i;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
