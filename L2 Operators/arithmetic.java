public class arithmetic {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        System.out.println("Pre Increment: " + (++a));
        System.out.println("Post Increment: " + (b++));
    }
}

/* 
    ARITHMETIC OPERATORS

    Binary: + , - , * , / , %
    Unary: ++, --

    PreIncrement/Decrement: Changes the value and uses the new value
    PostIncrement/Decrement: Changes the value but uses the old value
 */