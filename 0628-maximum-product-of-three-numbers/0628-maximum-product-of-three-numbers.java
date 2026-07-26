class Solution {
    public int maximumProduct(int[] nums) {
        int maxProd=Integer.MIN_VALUE;
        Arrays.sort(nums);
        int n=nums.length;
        int min=nums[0];
        int secMin=nums[1];
        int max=nums[n-1];
        int secMax=nums[n-2];
        int thMax=nums[n-3];
        
        maxProd=Math.max((max*secMax*thMax), (min*secMin*max));
        return maxProd;
    }
}