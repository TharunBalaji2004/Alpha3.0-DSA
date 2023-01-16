public class typecasting {
    public static void main(String[] args) {
        float f = 25.98439483f;
        int marks = (int)f;
        System.out.println(marks);  // Returns the integer part without rounding off

    }
}

/* TYPE CASTING in JAVA (Explicit Conversion / Shortening)
 *  Converting one datatype to another which is not possible in TYPE CONVERSION
 *  i.e. from High -> Low Datatype
 *  
 *  (Eg) Float -> Int is not possible, but using Type Casting
 *      int marks = (int) f;     
 * 
 */
