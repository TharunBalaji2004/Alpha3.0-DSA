import java.util.Scanner;

public class ShortestPath {
    public static int shortestDistance(String s){
        int length = s.length();
        int x = 0, y = 0;

        for (int i=0;i<length;i++){
            char ch = s.charAt(i);
            if (ch == 'E') x++;
            else if (ch == 'N') y++;
            else if (ch == 'W') x--;
            else y--;
        }

        int distance = (int)Math.sqrt(x*x + y*y);
        return distance;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int shdist = shortestDistance(s);
        System.out.println("Shortest Distance: " + shdist);
    }    
}
