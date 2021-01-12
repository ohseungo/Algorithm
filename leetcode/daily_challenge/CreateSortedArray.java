package daily_challenge;

public class CreateSortedArray {
	//펜윅 트리 기초 
	// i && -i = 첫번째 1이 나오는 수 이용하여 트리 update 및 get 
	
	// static 변수를 못쓰는 문제의 경우 class 활용하는 것도 유념 
	
	    class Fenwick {
	        int[] tree;
	        public Fenwick(int length) {
	            tree = new int[length];
	        }
	        
	        public void add(int index, int value) {
	            while (index < tree.length) {
	                tree[index] += value;
	                index += index & -index;
	            }
	        }

	        public int query(int index) {
	            int result = 0;
	            while (index > 0) {
	                result += tree[index];
	                index -= index & -index;
	            }
	            return result;
	        }
	    }
	    public int createSortedArray(int[] instructions) {
	        Fenwick tree = new Fenwick(100001);
	        int cost = 0;
	        int lCost, rCost;
	        
	        for (int i = 0; i < instructions.length; i++) {
	            lCost = tree.query(instructions[i] - 1);
	            rCost = i - tree.query(instructions[i]);
	            cost += Math.min(lCost, rCost);
	            cost %= 1000000007;
	            tree.add(instructions[i], 1);
	        }
	        
	        return cost;
	    }
}
