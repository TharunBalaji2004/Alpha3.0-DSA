import java.util.Scanner;

public class intrighttriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int line = sc.nextInt();

        for(int i=1;i<=line;i++){
            for(int j=1;j<=(line - i + 1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }       
    }
}

/*
OUTPUT:

* * * *
* * *
* *
*

Line  Times
 1     4-1+1 = 4
 2     4-2+1 = 3
 3     4-3+1 = 2
 3     4-4+1 = 1

 i     4-i+1 
*/