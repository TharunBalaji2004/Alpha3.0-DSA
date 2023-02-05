import java.util.Scanner;

public class GetithBit {
    public static int getithBit(int n,int i){
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) return 0;
        else return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter positon of bit (0 based indexing): ");
        int pos = sc.nextInt();

        System.out.println("Bit at " + pos + " position: " + getithBit(num, pos));
    }
}

/*
5 -> (101)

Enter a number: 5
Enter positon of bit (0 based indexing): 2
Bit at 2 position: 1
*/