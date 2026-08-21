class Solution {
public TreeNode buildTree(int[] preorder, int[] inorder) {
Map<Integer,Integer> map=new HashMap<>();
for(int i=0;i<inorder.length;i++){
map.put(inorder[i],i);
}
TreeNode root=x(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map) ;
return root;

}
public TreeNode x(int[]preorder,int sp,int ep,int[] inorder, int si,int ei,Map<Integer,Integer> m){
if (sp>ep || si>ei) return null;
TreeNode root=new TreeNode(preorder[sp]);
int i=m.get(preorder[sp]);
root.left=x(preorder,sp+1,sp+i-si,inorder,si,i-1,m);
root.right=x(preorder,sp+1+i-si,ep,inorder,i+1,ei,m);


return root;


}
}