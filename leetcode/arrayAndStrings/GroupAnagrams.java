package arrayAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Anagram �� ���ڿ� �׷�ȭ�ϱ�

���ڿ� �ٷ�� (���ڿ� -> charArray -> ���ڿ� )+ Map 

 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
    	
    	Map<String, ArrayList<String>> map = new HashMap<>();
    	char[] charArray;
    	ArrayList<String> temp;
    	String newStr;
    	for (String s : strs) {
    		charArray = s.toCharArray();
    		Arrays.sort(charArray);
    		newStr = new String(charArray);
    		
    		if (!map.containsKey(newStr)) {
    			temp = new ArrayList<>();
    			temp.add(s);
    			map.put(newStr, temp);
    		}else {
    			temp = map.get(newStr);
    			temp.add(s);
    		}
    	}
    	
    	return new ArrayList<>(map.values());
    }
}
