public class MaxSubarraySum2 {
    public static int maxSubarraySum(int arr[]){
        int prefix[] = new int[arr.length];
        int max = Integer.MIN_VALUE;

        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                int sum = 0;

                if (start == 0)
                    sum = prefix[end];
                else
                    sum = prefix[end] - prefix[start-1];
                
                if (sum > max)
                    max = sum;
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
APPROACH 2: PREFIX SUM
*/