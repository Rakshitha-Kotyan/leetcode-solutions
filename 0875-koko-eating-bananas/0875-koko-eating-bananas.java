class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    int low=1;
    int high=max(piles);
    //System.out.println(high);
    int ans=0;
    while(low<=high){
        int mid=(low+high)/2;
      //  System.out.println("mid "+mid);
        // System.out.println("Hourtook "+HourforMidbanana(piles,mid));
    
        if(HourforMidbanana(piles,mid)<=h){
            ans=mid;
            high=mid-1;
        } else {
            low=mid+1;
        }
        
    }
    return ans;  
    }
    public static int HourforMidbanana(int a[],int mi){
        int hour=0;
        for(int i=0;i<a.length;i++){
            hour+=Math.ceil((double) a[i]/(double) mi);
        }
        return hour;
    }

    public static int max(int arr[]){
    int maxx=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>maxx){
            maxx=arr[i];
        }
    }
    return maxx;
    }


}