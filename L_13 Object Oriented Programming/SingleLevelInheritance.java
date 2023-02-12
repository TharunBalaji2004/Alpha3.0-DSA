public class SingleLevelInheritance {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.bark();
        dog.bite();
    }
}

class Animal extends Dog{
    Animal(){
        breathe();
        walk();
        eat();
    }
    void breathe(){
        System.out.println("Breathe");
    }
    void walk(){
        System.out.println("Walk");
    }
    void eat(){
        System.out.println("Eat");
    }
}

class Dog {
    void bark(){
        System.out.println("Bark");
    }
    void bite(){
        System.out.println("Bite");
    }
}

/*
OUTPUT:
Breathe
Walk
Eat
Bark
Bite
 */