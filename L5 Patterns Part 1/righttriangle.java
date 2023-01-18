import java.util.Scanner;

public class righttriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int line = sc.nextInt();

        for(int i=1;i<=line;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*

OUTPUT:
*
* *
* * *
* * * *

 */