class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> out = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for(int right=0; right<s.length(); right++){
            while(out.contains(s.charAt(right))){
                out.remove(s.charAt(left));
                left++;
            }
            out.add(s.charAt(right));
            maxLength = Math.max(maxLength, out.size());
        }
        return maxLength;
    }
}
