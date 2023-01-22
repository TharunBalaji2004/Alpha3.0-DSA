import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        int countA=0,countD=0;

        for(char ch : s.toCharArray()){
            if (ch == 'A') countA++;
            else if (ch == 'D') countD++;
        }
        
        if (countA > countD) System.out.print("Anton");
        else if (countA < countD) System.out.print("Danik");
        else System.out.print("Friendship");
    }
}
