import java.util.Scanner;

public class pq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int real,img;

        System.out.println("First Number");
        System.out.print("Enter real part: ");
        real = sc.nextInt();
        System.out.print("Enter imaginary part: ");
        img = sc.nextInt();
        
        Complex num1 = new Complex(real,img);

        System.out.println("Second Number");
        System.out.print("Enter real part: ");
        real = sc.nextInt();
        System.out.print("Enter imaginary part: ");
        img = sc.nextInt();

        Complex num2 = new Complex(real, img);

        System.out.print("Sum: ");
        num1.sum(num1, num2);

        System.out.print("Difference: ");
        num1.difference(num1, num2);

        System.out.println("Product");
        num1.product(num1, num2);
    }
}

class Complex {
    int real,img;

    Complex (int real,int img){
        this.real = real;
        this.img = img;
    }

    void sum(Complex num1,Complex num2){
        int newreal = num1.real + num2.real;
        int newimg = num1.img + num2.img;
        System.out.println(newreal + "+i(" + newimg + ")");
    }

    void difference(Complex num1,Complex num2){
        int newreal = num1.real - num2.real;
        int newimg = num1.img - num2.img;
        System.out.println(newreal + "+i(" + newimg + ")");
    }

    void product(Complex num1,Complex num2){
        int newreal = num1.real*num2.real - num1.img*num2.img;
        int newimg = num1.real*num2.img + num2.real*num1.img;
        System.out.println(newreal + "+i(" + newimg + ")");
    }
}