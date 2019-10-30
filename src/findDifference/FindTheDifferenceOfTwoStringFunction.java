package findDifference;

import java.util.HashMap;

public class FindTheDifferenceOfTwoStringFunction {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Go through the original string and count how many times it appear
        for(char c : s.toCharArray()){
        	// If its null, make it to 0 then add 1
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        
        for(char c : t.toCharArray()){
        	// If map contain the key and value is 0, that means it appear only in string t
        	// If it does not contain inside map, right away it only appear in string t
            if(map.containsKey(c) && map.get(c) == 0 || !map.containsKey(c)){
                return c;
            } else {
            	// Update the value by subtracting one
                map.put(c, map.get(c) - 1);
            }
        }
        
        // This mean we did not find it
        return '?';
    }
}
