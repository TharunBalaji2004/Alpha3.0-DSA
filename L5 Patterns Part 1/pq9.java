import java.util.Scanner;

public class pq9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int lines = sc.nextInt();

        // Upper Half
        for(int i=1;i<=lines;i++){
            for(int gap=1;gap<=lines-i;gap++){
                System.out.print(" ");
            }
            for(int star=1;star<=i;star++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower Half (for condition only changes)
        for(int i=lines;i>=1;i--){
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

/*
OUTPUT

Enter number of lines: 12
     *
    * *
   * * *
  * * * *
 * * * * *
* * * * * *
 * * * * *
  * * * *
   * * *
    * *
     *

Here, the program generated 2*lines of rows
*/