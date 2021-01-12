package arrayAndStrings;


// i 번째에 확정 2등보다 큰애가 발견되면 OK
// 비슷한 로직을 k개에도 적용가능할듯 


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
