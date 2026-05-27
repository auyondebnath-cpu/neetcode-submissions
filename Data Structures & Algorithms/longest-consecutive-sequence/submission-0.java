class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for(int num: nums){
            map.add(num);
        }

        int best = 0;

        for(int num: map){
            if(!map.contains(num-1)){
                int length =1;
                while(map.contains(num+length)){
                    length++;
                }
                best = Math.max(best, length);
            }
        }

        return best;
    }
}
