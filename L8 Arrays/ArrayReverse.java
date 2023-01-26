public class ArrayReverse {
    public static void reverse(int arr[]){
        int first = 0;
        int last = arr.length-1;

        while (first < last){       // Swap first and last values
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};

        reverse(numbers);

        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
    }
}

