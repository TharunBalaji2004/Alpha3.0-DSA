import java.util.*;

public class pq5 {
    public static ArrayList<ArrayList<Integer>> triplets(int[] nums){
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>> ();

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if (nums[i]+nums[j]+nums[k] == 0){
                        ArrayList<Integer> Triplet = new ArrayList<Integer> ();
                        Triplet.add(nums[i]);
                        Triplet.add(nums[j]);
                        Triplet.add(nums[k]);
                        Collections.sort(Triplet);
                        res.add(Triplet);
                    }
                }
            }
        }

        res = new ArrayList<ArrayList<Integer>> (new LinkedHashSet<ArrayList<Integer>>(res));
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        
        System.out.print(triplets(nums));
    }
}
