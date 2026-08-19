class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[] = new int[2];
        a[0]=left(nums,target);
         a[1]=right(nums,target);
    return a;
    }

    public static int left(int[] nums, int target){
        int low=0,high=nums.length-1,ans=-1;
      while(low<=high){
        int mid = (low+high)/2;
        if(nums[mid]==target){
          ans=mid;
          high=mid-1;
        } else
        if(nums[mid]<target){
            low=mid+1;
        } else {
            high=mid-1;
        }
    }
    return ans;
}
public static int right(int[] nums, int target){
        int low=0,high=nums.length-1,ans=-1;
      while(low<=high){
        int mid = (low+high)/2;
        if(nums[mid]==target){
          ans=mid;
         low=mid+1;
        } else
        if(nums[mid]<target){
            low=mid+1;
        } else {
            high=mid-1;
        }
    }
    return ans;
}

}