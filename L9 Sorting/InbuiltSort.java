import java.util.*;

public class InbuiltSort {
    public static void main(String[] args) {
        int[] arr = {10,5,25,18,7};

        Arrays.sort(arr);
        
        System.out.print("Ascending Sorted Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr, 0, 3);

        // Wrapper class needed for Collections
        Integer[] array = {10,5,25,18,7};

        Arrays.sort(array,Collections.reverseOrder());

        System.out.print("Descending Sorted Array: ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}

/*
INBUILT SORT:
import java.util.*;

1) Arrays.sort(arr) 
- TC O(N log N) - Ascending order

2) Arrays.sort(arr, Collections.reverseOrder()) 
- TC O(N log N) - Descending order

3) Arrays.sort(arr, start, end)
- sort array from start to end-1 index
*/