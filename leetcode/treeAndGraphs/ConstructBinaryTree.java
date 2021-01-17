package treeAndGraphs;

public class ConstructBinaryTree {
	  /*
	   * InOrder, PreOrder �� Ư¡�� �� �ľ��ؾ� �ϴ� ���� ����
	   */
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	
        return new Tree(preorder, inorder).treeMaking(0, 0, inorder.length -1);
    }
    
    class Tree{
    	int[] preorder;
    	int[] inorder;
		public Tree(int[] preorder, int[] inorder) {
			this.preorder = preorder;
			this.inorder = inorder;
		}
    	
		//preStart : �ش� rootnode �� index (preorder ����)
		//inStart : �ش� rootnode �� tree ���� ������ (inorder ����)
		// inEnd : �ش� rootnode �� tree ���� ���� (inorder ����)
		public TreeNode treeMaking(int preStart, int inStart, int inEnd) {
			if (preStart >= preorder.length ) return null;
			if (inStart > inEnd) return null;
			
			//�־��� preStart �� rootNode ã�� 
			TreeNode root = new TreeNode(this.preorder[preStart]); 
			//rootNode �� �ش��ϴ� inorder �� index ã�� 
			int inRootIndex = 0; 
		
			for (int i = inStart; i<=inEnd; i++) {
				if (this.inorder[i] == root.val) {
					inRootIndex = i;
					break;
				}
			}
			// left Node : 
			// 1. preStart = rootNode �ٷ� ���� 
			// 2. inStart = �״�� 
			// 3 inEnd = inRootIndex �ٷ� �� 
			root.left = this.treeMaking(preStart+1, inStart, inRootIndex - 1);
			// right node :
			// 1 preStart = rootNode ��ġ + left ���� �ִ� Node ���� +1
			//               = rootNode ��ġ + (inorder ����) (rootNode ��ġ - ������  ) +1
			// 2. inStart = inorder ���� rootnode �ٷ� ����
			// 3. inEnd = �״�� 
			root.right = this.treeMaking(preStart + (inRootIndex - inStart) +1
											, inRootIndex +1, inEnd);
			
			return root;
		}
    	
    }
    
}
