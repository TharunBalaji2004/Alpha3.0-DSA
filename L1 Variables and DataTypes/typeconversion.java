public class typeconversion {
    public static void main(String[] args) {
        
        int a = 25;
        long b = a;

        System.out.println(b);

        int c = 30;
        float d = c;
        System.out.println(d); 

        long l = 355;
        float f = l;
        System.out.println(f);

        char ch = 'a';
        int number = ch;
        System.out.println(number); // Return ASCII value of ch

    }    
}

/* TYPE CONVERSION in JAVA (Implicit conversion / Widening)
 *  Conversion happens when
 *      1) Type Compatible
 *      2) Destination Type > Source Type (in terms of memory)
 *          byte -> short -> int -> float -> long -> double
 * 
 * (Eg) Conversion from int -> long is possible but long -> int is not possible
 */