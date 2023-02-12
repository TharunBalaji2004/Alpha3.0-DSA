public class AbstractClasses {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);    

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);
    }
}

abstract class Animal {
    String color;
    Animal() {
        color = "brown";
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}

class Horse extends Animal {
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    void changeColor(){
        color = "white";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}
/*
    Abstarct Class:
    - Cannot create an instance(object) of abstract class
    - Can have abstract/non-abstract methods
    - Can have constructors

    OUTPUT:
    Animal eats
    Walks on 4 legs
    brown
    Animal eats
    Walks on 2 legs
    brown
 */