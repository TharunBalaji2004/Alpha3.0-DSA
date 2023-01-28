public class OptBubbleSort {
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int swaps = 0;      // Initialize a swap variable
            for(int j=0;j<arr.length-1-i;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) break;  // If swap remains 0, then array is sorted
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,5,25,18,7};
        bubbleSort(arr);

        System.out.print("Sorted Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
