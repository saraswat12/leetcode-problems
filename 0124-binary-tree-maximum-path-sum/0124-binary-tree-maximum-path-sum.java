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
    private int maxv = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        
       helper(root);
    return  maxv;
        
    }
    
    public int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int leftsum = Math.max(helper(root.left), 0);
        int rightsum = Math.max(helper(root.right), 0);
        
        int curr = root.val + leftsum + rightsum;
        maxv = Math.max(curr, maxv);
        
        return root.val + Math.max(leftsum, rightsum);
        
        
        
    }
}