class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] cha = s.toCharArray();
            Arrays.sort(cha);
            String sorted = new String(cha);
            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
