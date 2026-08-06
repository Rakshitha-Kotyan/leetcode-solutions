class Solution {
    public int smallestNumber(int n, int t) {
        int ans=n;
        while(n<=100){
            ans=digitProd(n);
            if(ans%t==0){
                return n;
            }
            n++;
        }
        return n;
    }

    public int digitProd(int n){
        int prod=1;
        while(n!=0){
            int digit=n%10;
            prod*=digit;
            n=n/10;
        }
        return prod;
    }
}