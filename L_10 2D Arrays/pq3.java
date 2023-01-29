import java.util.Scanner;

public class pq3 {
    public static void transpose(int[][] matrix){
        System.out.println("Original Matrix");
        display(matrix);
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transmatrix = new int[cols][rows];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transmatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose of marix");
        display(transmatrix);
    }

    public static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter rows of a matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns of a matrix: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Enter "+i+j+" element: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        transpose(matrix);
    }
}

/*
OUTPUT:
Enter rows of a matrix: 2
Enter columns of a matrix: 3
Enter 00 element: 1
Enter 01 element: 2
Enter 02 element: 3
Enter 10 element: 4
Enter 11 element: 5
Enter 12 element: 6
Original Matrix
1 2 3 
4 5 6 
Transpose of marix
1 4 
2 5 
3 6
*/
