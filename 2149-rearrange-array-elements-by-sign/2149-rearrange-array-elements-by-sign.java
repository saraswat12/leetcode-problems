class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative  = new ArrayList<>();
        
        for (int num : nums) {
            if (num < 0) {
                negative.add(num);
            } else if (num > 0) {
                positive.add(num);
            }
        }
        
        int[] res = new int[nums.length];
        int posidx = 0, neidx =0;
        for(int i =0; i<nums.length; i++){
            
            if(i%2 == 0){
                res[i] = positive.get(posidx++);
            }
            else{
                res[i] = negative.get(neidx++);
            }

            
            
        }
        
        
        
        return res;
        
        
        
    }
}