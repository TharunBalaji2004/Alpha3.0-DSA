import java.util.*;

public class pq1_Naive {
    public static boolean valueTwice(int[] arr){
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i] == arr[j]) return true; 
            }
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