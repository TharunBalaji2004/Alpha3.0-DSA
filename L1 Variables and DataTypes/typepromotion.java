public class typepromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println(b - a); // char to int

        int A = 10;
        float B = 20.25f;
        long C = 25;
        double D = 30.0;
        double ans = A + B + C + D; // All the operands are converted to dobule
        System.out.println(ans);
    }
}

/* TYPE PROMOTION
 * 1) Java automatically promotes each byte, short or char operand to int when evaluating an expression
 *      byte, short, char -> int
 * 
 * 2) If one operand is long, float or double the whole expression is promoted to long, float or double
 *    respectively 
 */