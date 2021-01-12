package arrayAndStrings;

import java.util.HashMap;
import java.util.Map;

/*
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/779/
 * ���̵� : Medium
 */
public class LSWithoutRepeating {
	
//	�ð����⵵ n , �������⵵ n 
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
     * Sliding Window = �� ������ 
     * [i, j] ������ ���,  
     *  1) �ߺ��� ���� �� -> j ��ĭ ������ length ����
     *  2) ���� �� -> i ��ĭ ����
     *  �̷��� �ϸ� �ߺ� char index �� ������ �ʿ䰡 ���� 
     *  
     *  ******** �ߺ� üũ�� HashSet �̿� *****  => add, remove ���� 
     */
    
}
