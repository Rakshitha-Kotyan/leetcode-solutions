class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd=Integer.MAX_VALUE;
        int minEven=Integer.MAX_VALUE;

        for(int ele:nums1){
            if(ele%2==0){
                minEven=Math.min(ele,minEven);
            }
            else {
                minOdd=Math.min(ele,minOdd);
            }
        }
        if(minOdd==Integer.MAX_VALUE || minEven==Integer.MAX_VALUE) return true;
        return minOdd<minEven;
    }
}