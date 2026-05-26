class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] set = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for(int num: map.keySet()){
            pq.offer(num);
            if(pq.size()>k){
                pq.poll();
            }
        }

        for(int i =0; i<k; i++){
            set[i] = pq.poll();
        }

        return set;
    }
}
