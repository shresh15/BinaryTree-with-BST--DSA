/*********************************************************

 Following is the TreeNode structure:

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;
     TreeNode() {
         this.data = 0;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data, TreeNode left, TreeNode right) {
         this.data = data;
         this.left = left;
         this.right = right;
     }
 };
 ********************************************************/

import java.util.ArrayList;
import java.util.List;
public class Solution {
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        // Write your code here.
        List<List<Integer>> res =new ArrayList<>();
        res.add(inorder(root,new ArrayList<Integer>()));
        res.add(preorder(root,new ArrayList<Integer>()));
        res.add(postorder(root,new ArrayList<Integer>()));
        return res;
    }
     public static List<Integer> inorder(TreeNode root,ArrayList<Integer>li){
         if(root==null) return li;
         inorder(root.left,li);
         li.add(root.data);
         inorder(root.right,li);
         return li;
     }
      public static List<Integer> preorder(TreeNode root,ArrayList<Integer>li){
         if(root==null) return li;
         li.add(root.data);
         preorder(root.left,li);
         preorder(root.right,li);
         return li;
     }
      public static List<Integer> postorder(TreeNode root,ArrayList<Integer>li){
         if(root==null) return li;
        
         postorder(root.left,li);
         postorder(root.right,li);
          li.add(root.data);
          return li;
     }

}