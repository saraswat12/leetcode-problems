class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        
        
        int pairNo = 1;
        int lastEnd = pairs[0][1];
        for(int i =1; i<pairs.length; i++){
            if(pairs[i][0] > lastEnd){
                pairNo++;
                lastEnd = pairs[i][1];
            }
        }
        
        return pairNo;
        
    }
}