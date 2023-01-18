import java.util.Scanner;

public class numberpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int lines = sc.nextInt();

        for(int i=1;i<=lines;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/*

OUTPUT:
1
1 2
1 2 3 
1 2 3 4

 */