// Time Complexity : O(n) n is the number of nodes.
// Space Complexity : O(h) h is the height of the tree.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
       this.val = val;
      this.left = left;
      this.right = right;
    }
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q)
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left == null && right == null)
            return null;
        else if(left != null && right == null)
            return left;
        else if(left== null && right != null)
            return right;
        else
            return root;
    }
}