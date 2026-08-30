class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int minI=0;
        int maxI=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[maxI]){
                maxI=i;
            } else if(nums[i]<nums[minI]){
                minI=i;
            }
        }
        int l=Math.min(maxI, minI);
        int r=Math.max(maxI,minI);

        return Math.min(Math.min(r+1,n-l), l+1+n-r);
    }
}