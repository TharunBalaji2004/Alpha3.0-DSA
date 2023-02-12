public class MethodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
        Animal a = new Animal();
        a.eat();
    }
}

class Animal extends Deer {
    void eat(){
        System.out.println("Eat Anything");
    }
}
class Deer {
    void eat(){
        System.out.println("Eat Grass");
    }
}


/*
    Method Overriding (or) Run Time Polymorphism

    - Multiple functions with same name but different parameters (count of parameters, dataypes of parameters)

    OUTPUT
    Eat Grass
    Eat Anything    
 */