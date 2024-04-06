class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int diff = 0;
        int gasSum = 0;
        int costSum =0;
        
        int idx = 0;
        
        for(int i =0; i<gas.length; i++){
            gasSum += gas[i];
            costSum += cost[i];
        }
        
        if(gasSum < costSum){
            return -1;
        }
        
        for(int i =0; i<gas.length; i++){
            diff += gas[i] - cost[i];
            
            if(diff < 0){
                diff = 0;
                idx = i+1;
                
            }
        }
        
        return idx;
    }
}