public class MaxSubarraySum1 {
    public static int maxSubarraySum(int numbers[]){
        int max = Integer.MIN_VALUE;
        
        for (int i=0;i<numbers.length;i++){
            int start = i;
            for (int j=i;j<numbers.length;j++){
                int end = j;
                int temp = 0;
                for (int k=start;k<=end;k++){
                    temp += numbers[k];
                }
                if (temp > max)
                    max = temp;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        int max = maxSubarraySum(numbers);
        System.out.println("Maximum subarray sum: "+ max);
    }
}

/*
APPROACH 1:

Use the Naive approach of printing subarrays and calculate sum of each subarray
Return the maximum sum
*/