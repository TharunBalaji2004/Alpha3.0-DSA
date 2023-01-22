public class blockscope {
    public static void main(String[] args) {
        {
            int num = 45;
        }
        System.out.println(num); // Gives error because 'num' is block scope variable
    }
}
