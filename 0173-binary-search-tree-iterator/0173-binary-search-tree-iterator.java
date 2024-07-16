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
class BSTIterator {
    
    Stack<TreeNode> s = new Stack<>();
    

    public BSTIterator(TreeNode root) {
        pushleft(root);
        
    }
    
    public int next() {
        TreeNode trmp = s.pop();
        if(trmp.right != null){
            pushleft(trmp.right);
        }
        return trmp.val;
        
    }
    
    public boolean hasNext() {
        return !s.isEmpty();
        
    }
    
    public void pushleft(TreeNode root){
        if(root == null){
            return;
        }
        while(root != null){
            s.push(root);
            root = root.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */