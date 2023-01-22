public class methodoverload1 {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3,5,2));
    }    
}

/*
METHOD OVERLOADING (Number of Parameters)

    - Same method names but different number of parameters
    - During runtime, it chooses the correct method
*/