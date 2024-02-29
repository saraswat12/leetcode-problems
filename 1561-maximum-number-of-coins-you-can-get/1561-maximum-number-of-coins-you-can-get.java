class Solution {
    public int maxCoins(int[] piles) {
         int n = piles.length / 3; // Number of groups of three piles
        Arrays.sort(piles);
        
        int maxCoins = 0;
        int index = n * 3 - 2; // Starting index of the second-largest pile in each group
        
        for (int i = 0; i < n; i++) {
            maxCoins += piles[index];
            index -= 2;
        }
        
        return maxCoins;
    }
}