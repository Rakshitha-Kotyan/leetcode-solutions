class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> m = new HashMap<>();
       
        for(int i=0;i<n;i++){
            int ans=target-nums[i];
            if(m.containsKey(ans)){
                return new int[]{i,m.get(ans)};
            }
            m.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}