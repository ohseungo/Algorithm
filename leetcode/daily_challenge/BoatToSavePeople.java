package daily_challenge;

import java.util.Arrays;

//The i-th person has weight people[i], and each boat can carry a maximum weight of limit.
//
//Each boat carries at most 2 people at the same time, provided the sum of the weight of those people is at most limit.
//
//Return the minimum number of boats to carry every given person.  (It is guaranteed each person can be carried by a boat.)
//
// 
public class BoatToSavePeople {
	
	// ������ ������ ���� ������ ��� + ���ſ� ��� �������� �ѽ� Ȥ�� �ϳ��� ���������� 
    public int numRescueBoats(int[] people, int limit) {
    	Arrays.sort(people);
    	int small = 0;
    	int big = people.length -1;
    	int count = 0;
    	while (small <= big) {
    		if (small == big) {
    			small++;
    			count++;
    		}else {
    			if (people[small] + people[big] <= limit) {
    				small++;
    				big--;
    				count++;
    			}else {
    				big--;
    				count++;
    			}
    		}
    	}
    	
        return count;
    }
    
    // limit �� ������ ������ �迭�� ���� ����� 
    // ���� ��Ŷ ���ķ� ������ �� ���������� ���ʿ��� �������� ī��Ʈ
    // O(nlogn) => O(n) ���� ���� 
    public int numRescueBoats2(int[] people, int limit) {
        int[] buckets = new int[limit+1];
        for(int p: people) buckets[p]++;
        int start = 0;
        int end = buckets.length - 1;
        int solution = 0;
        while(start <= end) {
			//make sure the start always point to a valid number
            while(start <= end && buckets[start] <= 0) start++;
			//make sure end always point to valid number
            while(start <= end && buckets[end] <= 0) end--;
			//no one else left on the ship, hence break.
            if(buckets[start] <= 0 && buckets[end] <= 0) break;
            solution++;
            if(start + end <= limit) buckets[start]--; // both start and end can carry on the boat
            buckets[end]--;
        }
        return solution;
    }
}
