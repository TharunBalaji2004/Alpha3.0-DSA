import java.util.Scanner;

public class Searching2DArray {
    public static boolean search(int[][] matrix,int key){
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if (key == matrix[i][j])
                    return true;
            }
        }

        return false;
    }
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

        System.out.print("Enter element to search:");
        int key = sc.nextInt();

        if (search(matrix, key)){
            System.out.println("Element found in array");
        }
        else {
            System.out.println("Element not found in array");
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
Enter element to search:4
Element found in array
*/