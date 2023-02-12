public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        Rook r = new Rook();
        Bishop b = new Bishop();

        q.moves();
        r.moves();
        b.moves();
    }
}

interface Chess {
    void moves();
}

class Queen implements Chess {
    public void moves() {
        System.out.println("Up,Down,Left,Right,Diagonal");
    }
}

class Rook implements Chess {
    public void moves() {
        System.out.println("Up,Down,Left, Right");
    }
}

class Bishop implements Chess {
    public void moves() {
        System.out.println("Diagonal");
    }
}
/*
    Interface - Bueprint of a class
    Properties:
        1) All methds are public, abstract ad without implementation
        2) Used to achieve total abstraction
        3) Variables in the interfaces are final, public and static
    
    OUTPUT:
    Up,Down,Left,Right,Diagonal
    Up,Down,Left, Right
    Diagonal
    
*/