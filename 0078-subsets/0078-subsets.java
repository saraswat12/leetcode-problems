import java.util.*;

class Solution {
    
    public void call(int[] nums, List<Integer> output, int idx, List<List<Integer>> ans){
        
        ans.add(new ArrayList<>(output));
        
        for(int i = idx; i < nums.length; i++){
            output.add(nums[i]);
            call(nums, output, i + 1, ans);
            output.remove(output.size() - 1);
        }
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        
        call(nums, output, 0, ans);
        return ans;
    }
}
