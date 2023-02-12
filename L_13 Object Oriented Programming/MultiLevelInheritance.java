public class MultiLevelInheritance {
    public static void main(String[] args) {
        A obj = new A();
        obj.getA();
        obj.getB();
        obj.getC();
    }
}

class A extends B {
    void getA(){
        System.out.println("Inside Class A");
    }
}
class B extends C {
    void getB(){
        System.out.println("Inside Class B");
    }
}
class C {
    void getC(){
        System.out.println("Inside Class C");
    }
}

/*
OUTPUT:
Inside Class A
Inside Class B
Inside Class C
 */