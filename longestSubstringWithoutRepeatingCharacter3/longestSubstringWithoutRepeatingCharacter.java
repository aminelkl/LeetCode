/*
Given a string s, find the length of the longest substring without repeating characters.
*/

// This solution is definetely not the best one, but its working. The most optimal one is in the same folder

class Solution {
    public int lengthOfLongestSubstring(String s) {
    
        int maxLength = 0;
        
        for (int i = 0 ; i < s.length() ; i++) {
           for(int z = i  ; z < s.length(); z++) {
        	   String str = s.substring(i, z + 1);
        	   if (isItUnique(str)) {
        		   if (str.length() > maxLength) {
        		   maxLength = str.length();
        		   }
        	   }
           }
        
	}
        return maxLength;
	
	
	}
	
	public static boolean isItUnique(String str) {
		for (int i = 0 ; i < str.length() ; i++) {
			for (int z = i + 1 ; z < str.length() ; z++) {
				if (str.charAt(i) == str.charAt(z)) {
					return false;
				}
			}
		}
		return true;
        
    }
}
