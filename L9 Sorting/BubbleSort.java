public class BubbleSort {
    public static void bubbleSort(int[] numbers){
        for (int i=0;i<numbers.length;i++){
            for (int j=0;j<numbers.length-1-i;j++){
                if (numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
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
