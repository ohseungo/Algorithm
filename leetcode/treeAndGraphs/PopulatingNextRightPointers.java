package treeAndGraphs;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 기본적인 BFS 트리 탐색 복습 
 */
public class PopulatingNextRightPointers {
	class Node {
	    public int val;
	    public Node left;
	    public Node right;
	    public Node next;

	    public Node() {}
	    
	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val, Node _left, Node _right, Node _next) {
	        val = _val;
	        left = _left;
	        right = _right;
	        next = _next;
	    }
	};
	
    public Node connect(Node root) {
    	if (root == null) return root;
    	Queue<Node> q = new LinkedList<>();
    	q.add(root);
    	int size;
    	Node curr;
    	Node prev = null;
    	while (!q.isEmpty()) {
    		size = q.size();
    		prev = null;
    		for (int i =0; i<size; i++) {
    			curr= q.poll();
    			if (curr.left !=null ) q.offer(curr.left); 
    			if (curr.left !=null ) q.offer(curr.right);
    			if (prev !=null) prev.next = curr;
    			prev = curr;
    		}
    	}
    	
        return root;
    }
}
