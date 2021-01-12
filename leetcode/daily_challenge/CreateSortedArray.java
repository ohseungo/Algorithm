package daily_challenge;

public class CreateSortedArray {
	//���� Ʈ�� ���� 
	// i && -i = ù��° 1�� ������ �� �̿��Ͽ� Ʈ�� update �� get 
	
	// static ������ ������ ������ ��� class Ȱ���ϴ� �͵� ���� 
	
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
