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
    public List<Double> averageOfLevels(TreeNode root) {
        
       List<Double> l = new LinkedList<>();
        
        if(root == null){
            return l;
        }
     
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
     
        
        while(!q.isEmpty()){
            double sum = 0;
            int size = q.size();
            
            for(int i =0; i<size; i++){
                
                TreeNode curr = q.poll();
                
                 sum += curr.val;
                
                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                    
                }
    
                
            }
            l.add(sum / size);
        }
        
        
        return l;
        
        
        
        
    }
}