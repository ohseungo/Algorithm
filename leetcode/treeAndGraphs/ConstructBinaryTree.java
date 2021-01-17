package treeAndGraphs;

public class ConstructBinaryTree {
	  /*
	   * InOrder, PreOrder 의 특징을 잘 파악해야 하는 좋은 문제
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
    	
		//preStart : 해당 rootnode 의 index (preorder 기준)
		//inStart : 해당 rootnode 의 tree 범위 시작점 (inorder 기준)
		// inEnd : 해당 rootnode 의 tree 범위 끝점 (inorder 기준)
		public TreeNode treeMaking(int preStart, int inStart, int inEnd) {
			if (preStart >= preorder.length ) return null;
			if (inStart > inEnd) return null;
			
			//주어진 preStart 로 rootNode 찾기 
			TreeNode root = new TreeNode(this.preorder[preStart]); 
			//rootNode 에 해당하는 inorder 측 index 찾기 
			int inRootIndex = 0; 
		
			for (int i = inStart; i<=inEnd; i++) {
				if (this.inorder[i] == root.val) {
					inRootIndex = i;
					break;
				}
			}
			// left Node : 
			// 1. preStart = rootNode 바로 다음 
			// 2. inStart = 그대로 
			// 3 inEnd = inRootIndex 바로 전 
			root.left = this.treeMaking(preStart+1, inStart, inRootIndex - 1);
			// right node :
			// 1 preStart = rootNode 위치 + left 측에 있는 Node 개수 +1
			//               = rootNode 위치 + (inorder 기준) (rootNode 위치 - 시작점  ) +1
			// 2. inStart = inorder 기준 rootnode 바로 다음
			// 3. inEnd = 그대로 
			root.right = this.treeMaking(preStart + (inRootIndex - inStart) +1
											, inRootIndex +1, inEnd);
			
			return root;
		}
    	
    }
    
}
