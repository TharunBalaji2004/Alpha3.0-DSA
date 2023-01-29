public class pq2 {
    public static void main(String[] args) {
        int[][] nums = {{1,4,9},{11,4,3},{2,2,3}};
        int sum = 0;

        for(int i=0;i<nums[0].length;i++){
            sum += nums[1][i];  // second row (i=1)
        }

        System.out.println(sum);
    }
}

/*
OUTPUT:
18
*/