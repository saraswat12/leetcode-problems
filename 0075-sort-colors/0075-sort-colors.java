class Solution {
    public void sortColors(int[] nums) {
      
        
        int a = 0;
        int b =0;
        int c = 0;
        
        for(int i =0; i<nums.length; i++){
            if(nums[i] == 0){
                a+=1;
            }
            else if(nums[i] == 1){
                b+=1;
            }
            else{
                c+=1;
            }
           
            
        }
        
        
         
        for(int j = 0; j<a; j++){
            nums[j] = 0;
        }
        
        for(int k = a; k<a+b; k++){
            nums[k] = 1;
        }
        
        for(int l =a+b; l<a+b+c; l++){
            nums[l] = 2;
        }
            
        
        
        
        
        
        
        
    }
}