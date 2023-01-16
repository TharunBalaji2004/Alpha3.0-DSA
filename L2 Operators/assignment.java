public class assignment {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Original values");
        System.out.println("a = " + a + " b = " + b);

        int c = 2;
        a += c;
        b -= c;

        System.out.println("Modified values");
        System.out.println("a = " + a + " b = " + b);
    }
}
