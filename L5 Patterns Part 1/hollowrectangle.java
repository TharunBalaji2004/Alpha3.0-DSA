import java.util.Scanner;

public class hollowrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();

        for(int i=1;i<=breadth;i++){
            System.out.print("* ");
            for(int j=1;j<=length;j++){         
                if (i == 1 || i == breadth){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }            
            }
            System.out.print("* ");
            System.out.println();
        }
    }
}

/*
OUTPUT: 
Enter length: 5
Enter breadth: 4
 
* * * * *
*       *
*       *
* * * * *

length = Number of columns
breadth = Number of rows
*/