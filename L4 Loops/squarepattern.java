public class squarepattern {
    public static void main(String[] args) {
        int n = 4;        
        int rows = 0;
        int cols = 0;
        
        // Using while loop
        while (rows < n){
            cols = 0;
            while (cols < n){
                System.out.print("*");
                cols++;
            }
            System.out.println();
            rows++;
        }

        System.out.println();
        // Using for loop
        for(rows = 0;rows < n;rows++){
            for(cols = 0;cols < n;cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
