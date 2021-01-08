package arrayAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * FeedBack 
 ArrayList = 내용물 및 순서가 같으면 equals 
 Set = 중복처리에 용이
 
 List <=> Set 변환 쉬움 
 

*/
public class ThreeSum {
	
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        
        int len = nums.length;
        int a, b, c;
        int left, right;
        List<Integer> list;
        for (int i = 0; i < len; i++) {
        	a = nums[i];
        	if (a > 0) break;
        	
        	left = i + 1;
        	right = len - 1;
        	
        	while (left < right) {
        		b = nums[left];
        		c = nums[right];
        		
        		if (b+c > -a) {
        			right--;
        		}else if (b+c < -a) {
        			left++;
        		}else {
        			//추가 체크
        			if (!map.containsKey("" + a + b + c)) {
        				map.put("" + a + b + c, 1);
        				list = new ArrayList<Integer>();
        				list.add(a);
        				list.add(b);
        				list.add(c);
        				answer.add(list);
        			}
        			
        			right--;
        			left++;
        		}
        	}//while end 
        	
        }// a end
        
        
        return answer;
    }
    
    //feedback 
    public List<List<Integer>> threeSum_2(int[] nums) {
        Set<List<Integer>> answer = new HashSet<>();
        Arrays.sort(nums);
        
        int len = nums.length;
        int a, b, c;
        int left, right;
        List<Integer> list;
        for (int i = 0; i < len; i++) {
        	a = nums[i];
        	if (a > 0) break;
        	
        	left = i + 1;
        	right = len - 1;
        	
        	while (left < right) {
        		b = nums[left];
        		c = nums[right];
        		
        		if (b+c > -a) {
        			right--;
        		}else if (b+c < -a) {
        			left++;
        		}else {
    				list = new ArrayList<Integer>();
    				list.add(a);
    				list.add(b);
    				list.add(c);
        			answer.add(list);
   
        			right--;
        			left++;
        		}
        	}//while end 
        	
        }// a end
        
        
        return new ArrayList<>(answer);
    }

}
