class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()) return false;

        HashMap<Character, Integer> q = new HashMap<>();

        for(Character c : s.toCharArray()){
            if(q.containsKey(c)){
                q.put(c, q.get(c)+1);
            } else{
                q.put(c, 1);
            }
        }

        for(Character c: t.toCharArray()){
            if(!q.containsKey(c)) return false;
            q.put(c, q.get(c)-1);
            if(q.get(c)==0) q.remove(c);
        }

        return q.isEmpty();
    }
}
