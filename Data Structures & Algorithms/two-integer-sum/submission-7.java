class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] sum = new int[nums.length][2];
        for(int i=0; i<nums.length; i++){
            sum[i][0] = nums[i];
            sum[i][1] = i;
        }
        Arrays.sort(sum, Comparator.comparingInt(a -> a[0]));
        int i = 0, j = nums.length -1;
        while(i<j){
            int curr = sum[i][0] + sum[j][0];
            if(curr==target) return new int[]{Math.min(sum[i][1],sum[j][1]), Math.max(sum[i][1],sum[j][1])};
            else if(curr<target) i++;
            else j--;
        }
        return new int[0];
    }
}
