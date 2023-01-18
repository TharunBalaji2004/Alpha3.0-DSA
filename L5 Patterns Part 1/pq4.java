import java.util.Scanner;

public class pq4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int lines = sc.nextInt();
        int num = 1;

        for(int i=1;i<=lines;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        
    }
}

/*
Initialize a variable num = 1

OUTPUT:
Enter number of lines: 5
1 
2 3 
4 5 6 
7 8 9 10
11 12 13 14 15
*/