import java.util.Scanner;

public class pq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int lines = sc.nextInt();
        
        for(int i=1;i<=lines;i++){
            for(int num=1;num<=(lines-i+1);num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }    
}

/*
OUTPUT:

12345
1234 
123  
12   
1

Here, no gap calculation is needed
*/