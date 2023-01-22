import java.util.*;

public class bintodeci {
    public static int binToDec(int binNum){
        int pow = 0;
        int decNum = 0;

        while (binNum > 0){
            int lastDig = binNum%10;
            decNum = decNum + lastDig*(int)Math.pow(2,pow);
            binNum = binNum/10;
            pow++;
        }

        return decNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int num = sc.nextInt();

        int res = binToDec(num);
        System.out.println("Decimal of "+num+" is "+res);
    }
}
