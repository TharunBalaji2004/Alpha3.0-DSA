public class ArraySubArrays {
    public static void printSubArrays(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};

        printSubArrays(numbers);
    }
}

/*
TC: O(N^3)
OUTPUT:
2 
2 4
2 4 6
2 4 6 8
2 4 6 8 10
4
4 6
4 6 8
4 6 8 10
6
6 8
6 8 10
8
8 10
10

Total number of subarrays = n(n+1)/2
*/