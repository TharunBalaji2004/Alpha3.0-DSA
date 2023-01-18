import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbe of lines: ");
        int lines = sc.nextInt();
        char ch = 'A';

        for(int i=1;i<=lines;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}

/*
OUTPUT:
A
BC
DEF
GHIJ

Initialize a variable with 'A' and increment for each iteration
*/