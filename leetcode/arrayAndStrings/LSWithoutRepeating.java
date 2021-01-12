package arrayAndStrings;

import java.util.HashMap;
import java.util.Map;

/*
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/779/
 * 난이도 : Medium
 */
public class LSWithoutRepeating {
	
//	시간복잡도 n , 공간복잡도 n 
    public int lengthOfLongestSubstring(String s) {     
    	int answer = 0;
    	char[] charArr = s.toCharArray();
    	Map<Character, Integer> check = new HashMap<>();
    	char curr;
    	int start = 0;
    	
    	for (int i = 0; i<charArr.length; i++) {
    		curr = charArr[i];
    		if (check.containsKey(curr) ) {
    			start = Math.max(start, check.get(curr) + 1);
    		}
    		check.put(curr, i);
    		System.out.println(i - start + 1);
    		answer = Math.max(i - start + 1, answer);
    	}
    	
    	return answer ;
    }

    /*
     * Sliding Window = 투 포인터 
     * [i, j] 범위를 잡고,  
     *  1) 중복이 없을 떄 -> j 한칸 전진후 length 갱신
     *  2) 있을 떄 -> i 한칸 전진
     *  이렇게 하면 중복 char index 를 저장할 필요가 없음 
     *  
     *  ******** 중복 체크는 HashSet 이용 *****  => add, remove 용이 
     */
    
}
