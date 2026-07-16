class Solution {
    public long gcdSum(int[] nums) {
        int mx=0;
        long prefixGcd[] = new long[nums.length];
        for(int i=0;i<nums.length;i++){
            mx=Math.max(mx,nums[i]);
            prefixGcd[i]=gcd(mx,nums[i]);
        }
        Arrays.sort(prefixGcd);
        int i=0;
        int j=prefixGcd.length-1;
        long sum=0;
        while(i<j){
            sum+=gcd(prefixGcd[i],prefixGcd[j]);
            i++;
            j--;
        }
        return sum;
    }

    public static long gcd(long a, long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}