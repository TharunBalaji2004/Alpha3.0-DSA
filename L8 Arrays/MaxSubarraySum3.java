public class MaxSubarraySum3 {
    public static int maxSubarraySum(int[] arr){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            cs = cs + arr[i];

            if (cs < 0)
                cs = 0;

            ms = Math.max(ms,cs);
        }
        return ms;
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        int max = maxSubarraySum(numbers);
        System.out.println("Maximum subarray sum: "+ max);
    }
}

/*
APPROACH 3: KADANE'S ALGORITHM

TC: O(N)
*/