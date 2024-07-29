class Solution {
    public void moveZeroes(int[] nums) {
        
        
        
       
        int count =0;
        int zero = 0;
        
        for(int i =0; i<nums.length; i++){
            
            
            if(nums[i] == 0){
                
                
                zero +=1;
    
            }
            
            else{
                nums[count] = nums[i];
                count++;
            }
    
        }
        
        for(int i =count; i<count+zero; i++){
            nums[i]= 0;
        }


        
    }
}