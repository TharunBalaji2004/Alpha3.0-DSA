import java.util.Scanner;

public class Creation2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows:");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns:");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Enter "+i+j+" element:");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("2D Array");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
OUTPUT:
Enter number of rows:3
Enter number of columns:3
Enter 00 element:1
Enter 01 element:2
Enter 02 element:3
Enter 10 element:4
Enter 11 element:5
Enter 12 element:6
Enter 20 element:7
Enter 21 element:8
Enter 22 element:9
2D Array
1 2 3 
4 5 6 
7 8 9
*/