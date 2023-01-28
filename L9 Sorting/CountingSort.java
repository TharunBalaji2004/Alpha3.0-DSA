public class CountingSort {
    public static int[] countingSort(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i] > max) max = arr[i];
        }
        // Create count array
        int[] count = new int[max+1];
        int[] newarr = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        // Update count array
        for(int i=1;i<count.length;i++){
            count[i] = count[i] + count[i-1];
        }

        for(int i=arr.length-1;i>=0;i--){
            newarr[--count[arr[i]]] = arr[i];
        }

        return newarr;
    }
    public static void main(String[] args) {
        int[] arr = {10,5,25,18,7};
        int[] newarr = new int[arr.length];
        newarr = countingSort(arr);

        System.out.print("Sorted Array: ");
        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i] + " ");
        }
    }
}
