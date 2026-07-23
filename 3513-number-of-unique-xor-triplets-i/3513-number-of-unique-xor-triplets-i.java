class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n<=2) return n;
        int c=1;
        while(c<=n){
            c <<=1;
        }
        return c;
    }
}