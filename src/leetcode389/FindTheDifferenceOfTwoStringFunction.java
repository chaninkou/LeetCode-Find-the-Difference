package leetcode389;

import java.util.HashMap;

public class FindTheDifferenceOfTwoStringFunction {
	// Fastest way to do it
    public char findTheDifference(String s, String t) {
        char[] sArray = s.toCharArray();
        
        char[] tArray = t.toCharArray();
        
        int ascis = 0;
        int ascit = 0;
        
        for(int i = 0; i < sArray.length; i++){
            ascis += (sArray[i] - 'a');
        }
        
        for(int j = 0; j < tArray.length; j++){
            ascit += (tArray[j] - 'a');
        }
        
        // If the answer is 4, which is e, just add back the 'a'
        return (char) (ascit - ascis + 'a');
    }
    
	// Since we know its only lowercase, using an array is fine
    public char findTheDifference1(String s, String t) {
        if(t.length() != s.length() + 1){
            return '?';
        }
        
        int[] map = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            map[s.charAt(i) - 'a']++;
        }
        
        for(int j = 0; j < t.length(); j++){
            map[t.charAt(j) - 'a']--;
            
            // Whichever value is negative will be the missing value
            if(map[t.charAt(j) - 'a'] < 0){
                return t.charAt(j);
            }
        }
        
        return '?';
    }
    
    public char findTheDifference2(String s, String t) {
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
