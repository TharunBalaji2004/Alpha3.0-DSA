public class InsertionSort {
    public static void insertionSort(int[] numbers){
        for(int i=1;i<numbers.length;i++){
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key){
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,5,25,18,7};

        insertionSort(arr);

        System.out.print("Sorted Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }   
}
