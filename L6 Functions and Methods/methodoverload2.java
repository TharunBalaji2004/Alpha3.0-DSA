public class methodoverload2 {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3.8f,4.2f));
    }
}

/*
METHOD OVERLOADING (Datatypes of parameters)

- Same method name but different paramenters
- During compile time, the method is resolved
*/