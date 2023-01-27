import java.util.*;

public class pq1_HashMap {
    public static boolean valueTwice(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }

        Set keys = map.keySet();
        Iterator i = keys.iterator();
        while (i.hasNext()){
            if (map.get(i.next()) > 1)
                return true;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(valueTwice(arr));
    }
}

/*
OUTPUT:
Enter size of array: 5
1
2
3
4
1
true

Enter size of array: 5
1
2
3
4
5
false
*/
