public class BinarySearch {
    public static int binarysearch(int arr[], int key){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (arr[mid] > key)
                end = mid - 1;
            else if (arr[mid] < key)
                start = mid + 1;
            else
                return mid;
        }

        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 10;

        int index = binarysearch(numbers, key);

        if (index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: "+index);
    }       
}

/*
BINARY SEARCH:
    Search the required element by comparing with middle element of array
    and splits the array virtually into two halfs

    Time Complexity: O(log N)
    Space Complexity: O(1)
*/