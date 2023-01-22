import java.util.*;

public class decitobin {
    public static int decToBin(int decNum){
        int pow = 0;
        int binNum = 0;

        while (decNum > 0){
            int rem = decNum%2;
            binNum = binNum + rem*(int)Math.pow(10,pow);
            decNum = decNum/2;
            pow++;
        }

        return binNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Decimal number: ");
        int num = sc.nextInt();

        int res = decToBin(num);
        System.out.println("Binary of "+num+" is "+res);
    }
}