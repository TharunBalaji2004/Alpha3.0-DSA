import java.util.Scanner;

public class pq10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int lines = sc.nextInt();
        int var = 1;

        for(int i=1;i<=lines;i++){
            for(int gap=1;gap<=lines-i;gap++){
                System.out.print(" ");
            }
            for(int num=1;num<=i;num++){
                System.out.print(var+" ");
                
            }
            var++;
            System.out.println();
        }

    }
}
