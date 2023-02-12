public class OOPS {
    public static void main(String[] args) {
        Pen obj = new Pen();    // Initializing Pen Object

        obj.setColor("Blue");
        obj.setTip(5);

        System.out.println("Color of Pen: "+obj.color);
        System.out.println("Tip Size of Pen: "+obj.tip);
    }    
}

// Class Pen
class Pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}