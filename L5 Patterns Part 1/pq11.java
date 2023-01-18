import java.util.Scanner;

public class pq11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int lines = sc.nextInt();
        int var = 1;

        for(int i=1;i<=lines;i++){
            for(int gap=1;gap <=lines-i;gap++){
                System.out.print("  ");
            }
            for(int a=var;a>1;a--){
                System.out.print(a + " ");
            }
            for(int b=1;b<=var;b++){
                System.out.print(b + " ");
            }
            System.out.println();
            var++;
        }
    }
}

/*
OUTPUT:
Enter number of lines: 5
        1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5 
*/