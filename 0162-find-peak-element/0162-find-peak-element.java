class Solution {
    public int findPeakElement(int[] nums) {
        int s=0;
        int e=nums.length-1;
        int mid=0;
       
       
        while(s<e){
            mid=(s+e)/2;
            if(nums[mid+1]>nums[mid])
                s=mid+1;
            else
                e=mid;
        }
        
        return s;
    }
}