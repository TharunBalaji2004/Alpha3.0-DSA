public class LinearSearch {
    public static int linearsearch(int arr[], int key){
        for (int i=0;i<arr.length;i++){
            if (arr[i] == key)
                return i;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 8;

        int index = linearsearch(numbers,key);

        if (index == -1)
            System.out.println("Element not found in array");
        else
            System.out.println("Element found at index: "+index);
    }
}

/*
LINEAR SEARCH:
    Search the required element by comparing each element with key linearly

    Time Complexity: O(N)
    Space Complexity: O(1)
*/