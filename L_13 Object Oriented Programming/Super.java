public class Super {
    public static void main(String[] args) {
        Horse obj = new Horse();
    }
}

class Animal {
    Animal() {
        System.out.println("Animal Constructor called");
    }
}

class Horse extends Animal {
    Horse() {
        super();
        System.out.println("Horse Constructor called");
    }
}

/*
    Super keyword:
    - to access immediate parent's properties
    - to access immediate parent's functions
    - to access immediate parent's constructor
 */