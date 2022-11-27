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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        
        //lets follow a BFS approach
        
        
        if(root1 == null) return root2;
        
        
        dfs(root1,root2);
        
        return root1;
        
    }
    
    public void dfs(TreeNode root1, TreeNode root2){
        
        //System.out.println("Here "+root1.val+" "+root2.val);
        
        if(root1!=null && root2 != null)
            root1.val += root2.val;
    
        if(root2!= null && root1.left == null && root2.left != null)
            root1.left = new TreeNode(0);
        
        if(root2!= null && root1.right == null && root2.right != null)
            root1.right = new TreeNode(0);
        
        if(root2!=null)
        dfs(root1.left,root2.left);
        if(root2!=null)
        dfs(root1.right,root2.right);
        
    }
}