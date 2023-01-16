import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3;

        HashMap<String,String> map = new HashMap<>();
        
        for(int x = 0;x<n;x++){
            String line = sc.nextLine();
            String[] cc = line.split(" ");
            map.put(cc[0],cc[1]);
        } 

        String country = sc.nextLine();

        if (map.get(country) == null){
            System.out.print("NONE");
        }
        else {
            System.out.print(map.get(country));
        }
    }
}
