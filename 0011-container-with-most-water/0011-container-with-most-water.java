class Solution {
    public int maxArea(int[] height) {
        

        int l =0;
        int r = height.length-1;
        int max1 = 0;
        int area = 0;
        
        while(l<r){
            area = (r-l)*Math.min(height[l], height[r]);
            max1 = Math.max(max1, area);
            
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        
        return max1;
            



        
    }
}