package arrayAndStrings;


// i ��°�� Ȯ�� 2��� ū�ְ� �߰ߵǸ� OK
// ����� ������ k������ ���밡���ҵ� 


public class IncreasingTriplet {
    public boolean increasingTriplet(int[] nums) {
    	int first = Integer.MAX_VALUE;
    	int second = Integer.MAX_VALUE;
    	for (int num : nums) {
    		if (num < first) {
    			first = num;
    		}else if (num > first && num < second ) {
    			second = num;
    		}else if (num > second){
    			return true;
    		}
    	}
    	return false;
    }

}
