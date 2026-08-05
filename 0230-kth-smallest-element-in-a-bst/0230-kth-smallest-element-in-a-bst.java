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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> a = new ArrayList<>();
        inorder(root,a);
        return a.get(k-1);
    }
    public void inorder(TreeNode node,List<Integer> l){
        if(node==null) return;
        inorder(node.left,l);
        l.add(node.val);
        inorder(node.right,l);
    }
}