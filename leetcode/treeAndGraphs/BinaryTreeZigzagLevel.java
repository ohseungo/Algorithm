package treeAndGraphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevel {
	  public class TreeNode {
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
	  
	   public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	       ArrayList<List<Integer>> answer = new ArrayList<>();
	       ArrayList<Integer> list;
	       Queue<TreeNode> q = new LinkedList<>();
	       if (root!=null) q.add(root);
	       int length;
	       TreeNode temp;
	       boolean reverse = false;
	       while(!q.isEmpty()) {
	    	   length = q.size();
	    	   list = new ArrayList<>();
	    	   for (int a = 0; a<length; a++) {
	    		   temp = q.poll();
	    		   list.add(temp.val);
	    		   if (temp.left !=null) q.add(temp.left);
	    		   if (temp.right != null) q.add(temp.right);
	    	   }
	    	   if (reverse) Collections.reverse(list);
	    	   answer.add(list);
	    	   reverse = !reverse;
	       }
	       
		   return answer;
	    }
}
