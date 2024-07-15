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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        return build(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
        
    }
    
    public TreeNode build(int[] preorder, int prestart, int preend, int[] inorder, int instart, int inend){
        if(prestart > preend && instart > inend){
            return null;
        }
        
        int rootVal = preorder[prestart];
        TreeNode rootNew = new TreeNode(rootVal);
        
        int rootidx = -1;
        for(int i = instart; i<=inend; i++){
            if(inorder[i] == rootVal){
                rootidx = i;
                break;
            }
        }
        
        int leftSize = rootidx - instart;
        
       rootNew.left = build(preorder, prestart+1, prestart+leftSize, inorder, instart, rootidx-1);
        rootNew.right = build(preorder, prestart+leftSize+1, preend, inorder, rootidx+1, inend);
        
        
        return rootNew;
    }
}