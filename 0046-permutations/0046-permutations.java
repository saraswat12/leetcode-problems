class Solution {
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    
    public void prob(int[] nums, int idx, List<List<Integer>> ans){
        
        if(idx >= nums.length){
            List<Integer> templist = new ArrayList<>();
            for(int n: nums){
                templist.add(n);
            }
            ans.add(templist);
            return;
        }
        
        for(int i = idx; i<nums.length; i++){
            
            swap(nums, idx, i);
            
            prob(nums, idx+1, ans);
            
            swap(nums, idx, i);
            
        }
        
    }
    
    
    
    public List<List<Integer>> permute(int[] nums) {
        
        
        List<List<Integer>> ans = new ArrayList<>();
        
        prob(nums, 0, ans);
        return ans;
        
        
        
        
    }
}