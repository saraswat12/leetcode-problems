class Solution {
    
    public long binary(int n){
        
        if(n==0 || n==1){
            return n;
        }
        
        
        int s = 0;
        int e = n;
        
       long ans = -1;
         long mid = s + (e-s)/2;

        
        while(s<=e){
                    long square = mid*mid;

            if(square == n){
                return mid;
            }
            
            
            else if(square<n){
               ans = mid;
                s = (int)mid+1;
                
            }
            else{
                e = (int)mid-1;
            }
            
             mid = s + (e-s)/2;
            
        }
        
        return ans;
        
        
    }
        
    
    
    public int mySqrt(int x) {
        
        return (int)binary(x);
        
    }
}