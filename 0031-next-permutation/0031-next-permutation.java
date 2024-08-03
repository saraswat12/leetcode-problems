class Solution {
    public void nextPermutation(int[] nums) {
        
        
        int j = -1;
        int n=nums.length;
        for(int i =  n-1; i>0; i--){
            if(nums[i]>nums[i-1])
            {
                j=i-1;
                break;
            }
        }
            if(j!=-1)
            {
               for(int i=n-1;i>=j+1;i--)
               {
                   if(nums[j]<nums[i])
                   {
                       int t=nums[i];
                       nums[i]=nums[j];
                       nums[j]=t;
                       break;
                    }
            }
                
           int first = j+1;
            int last = n-1;
                
            while(first < last){
                int temp = nums[first];
                nums[first] = nums[last];
                nums[last] = temp;
                
                first++;
                last--;
            }
                
                
                
                
            }
             else
             {
                 int first = 0;
            int last = n-1;
                
            while(first < last){
                int temp = nums[first];
                nums[first] = nums[last];
                nums[last] = temp;
                
                first++;
                last--;
             }
            }
        }
        
        
        
        
        
        
        
}