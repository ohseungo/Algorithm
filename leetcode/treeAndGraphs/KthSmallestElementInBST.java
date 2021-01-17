package treeAndGraphs;
/*
 * BST = InOrder 방식으로 탐색 
 */
public class KthSmallestElementInBST {
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
	
    public int kthSmallest(TreeNode root, int k) {
        Tree tree = new Tree(k);
        tree.tracking(root);
        
        return tree.answer;
    }
    class Tree {
    	int answer;
    	int count;
    	
    	public Tree(int count) {
    		this.count = count;
    		this.answer = 0;
    	}
    	
    	public void tracking(TreeNode node) {
    		if (answer !=0) return;
    		// 1 . 왼쪽 자신 노드
    		if (node.left != null) tracking(node.left); 
    		
    		if (answer !=0 ) return;
    		// 2. 부모 노드 = 자신 
    		count--;
    		if (count ==0) {
    			this.answer = node.val;
    			return;
    		}
    		// 3. 오른쪽 자식 노드
    		if (node.right!=null) tracking(node.right);
    	}
    }
}
