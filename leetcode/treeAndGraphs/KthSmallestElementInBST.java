package treeAndGraphs;
/*
 * BST = InOrder ������� Ž�� 
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
    		// 1 . ���� �ڽ� ���
    		if (node.left != null) tracking(node.left); 
    		
    		if (answer !=0 ) return;
    		// 2. �θ� ��� = �ڽ� 
    		count--;
    		if (count ==0) {
    			this.answer = node.val;
    			return;
    		}
    		// 3. ������ �ڽ� ���
    		if (node.right!=null) tracking(node.right);
    	}
    }
}
