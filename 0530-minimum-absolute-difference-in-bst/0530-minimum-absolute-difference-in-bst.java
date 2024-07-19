/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int getMinimumDifference(TreeNode root) {
        
        if(root == null){
            return 0;
        }
        
         int minDiff = Integer.MAX_VALUE;
        
        List<Integer> values = new ArrayList<>();
        
         inOrderTraversal(root, values);
        
        for(int i =1; i<values.size(); i++){
            minDiff = Math.min(minDiff, values.get(i) - values.get(i-1));
        }
        
        return minDiff;
        
        
    }
        private void inOrderTraversal(TreeNode node, List<Integer> values) {
        if (node == null) {
            return;
        }
        
        // Traverse the left subtree
        inOrderTraversal(node.left, values);
        
        // Visit the current node
        values.add(node.val);
        
        // Traverse the right subtree
        inOrderTraversal(node.right, values);
    }

}