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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
        
    }
    
    public TreeNode build(int[] inorder, int si, int ei, int[] postorder, int sp, int ep){
        
        if(sp > ep && si > ei){
            return null;
        }
        
        int val = postorder[ep];
        TreeNode newRoot = new TreeNode(val);
        int idx = -1;
        for(int i =0; i<= ei; i++){
            if(inorder[i] == val){
                idx = i;
                break;
            }
            
        }
        
        int leftsize = idx - si;
        int rightsize = ei - idx;
        
        newRoot.left = build(inorder, si, idx-1, postorder, sp, sp+leftsize-1);
        newRoot.right = build(inorder, idx+1, ei, postorder, ep-rightsize, ep-1);
        
        return  newRoot;
        
    }
    
    
    
    
    
}