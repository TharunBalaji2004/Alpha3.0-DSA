public class MethodOverloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.sum(2, 8));
        System.out.println(obj.sum(3.5f, 4.5f));
        System.out.println(obj.sum(4, 4, 4));
    }
}

class Calculator {
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}

/*
    Method Overloading (or) Compile Time Polymorphism

    - Multiple functions with same name but different parameters (count of parameters, dataypes of parameters)

    OUTPUT
    10
    8.0
    12
 */