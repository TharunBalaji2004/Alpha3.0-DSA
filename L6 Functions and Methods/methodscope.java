public class methodscope {
    public static void printS(){
        int s = 45;
        System.out.println(s);
    }
    public static void main(String[] args) {
        System.out.println(s); // Gives Error because 's' is printS method scope
    }
}
