class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prodArr[] = new int[n];
        int prefix=1;
        int postfix=1;

        for(int i=0;i<n;i++){
            prodArr[i]=prefix;
            prefix*=nums[i];
        }

        for(int j=n-1;j>=0;j--){
            prodArr[j]*=postfix;
            postfix*=nums[j];
        }

        return prodArr;
        
    }
}