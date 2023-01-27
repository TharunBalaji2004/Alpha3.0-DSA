public class SelectionSort {
    public static void selectionSort(int[] numbers){
        for (int i=0;i<numbers.length;i++){
            int minpos = i;
            for (int j=i+1;j<numbers.length;j++){
                if (numbers[j] < numbers[i])
                    minpos = j;
            }
            int temp = numbers[minpos];
            numbers[minpos] = numbers[i];
            numbers[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,5,25,18,7};

        selectionSort(arr);

        System.out.print("Sorted ARray: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

/*
SELECTION SORT:
    - Finds the minimum element and swaps with beginning element of unsorted part
    - TC: O(N^2)
*/