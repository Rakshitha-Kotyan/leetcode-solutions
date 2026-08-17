class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg=Double.MIN_VALUE;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxAvg=(double) sum/k;
        
        for(int i=0;i<nums.length-k;i++){
            sum-=nums[i];
            sum+=nums[i+k];
          
            maxAvg=Math.max(maxAvg,(double) sum/k);
            
        }
        return maxAvg;
    }
}