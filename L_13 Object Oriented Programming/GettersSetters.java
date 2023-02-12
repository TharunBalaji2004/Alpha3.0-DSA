
public class GettersSetters {
    public static void main(String[] args) {
        Pen obj = new Pen();

        obj.setColor("Red");
        obj.setTip(5);

        System.out.println("Color of Pen: "+obj.getColor());
        System.out.println("Tip size of Pne: "+obj.getTip());
    }
}

class Pen {
    String color;
    int tip;

    // Getters
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    // Setters
    void setColor(String color){
        this.color = color;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}