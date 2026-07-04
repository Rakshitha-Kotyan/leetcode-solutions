class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int maxLeft[] = new int[n];
        int maxRight[] = new int[n];

        int maxL=0;
        for(int i=0;i<n;i++){
            maxL=Math.max(maxL,height[i]);
            maxLeft[i]=maxL;
        }

        int maxR=0;
        for(int i=n-1;i>=0;i--){
            maxR=Math.max(maxR,height[i]);
            maxRight[i]=maxR;
        }
        
        int totalWater=0;
        for(int i=0;i<n;i++){
            int m=Math.min(maxLeft[i],maxRight[i])-height[i];
            if(m>0){
                totalWater+=m;
            }
        }

        return totalWater;
        
    }
}