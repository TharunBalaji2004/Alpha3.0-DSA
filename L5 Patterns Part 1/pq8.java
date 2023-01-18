import java.util.Scanner;

public class pq8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int lines = sc.nextInt();

        for(int i=1;i<=lines;i++){
            for(int j=1;j<=lines*2 - 1;j++){
                int sum = i + j;
                if (i == 1 || i == lines){
                    if (sum >= lines+1 && sum <= lines*2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                else if (sum == lines+1 || sum == lines*2)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*
OUTPUT:
Enter number of lines: 5
    *****
   *   * 
  *   *  
 *   *   
***** 
*/