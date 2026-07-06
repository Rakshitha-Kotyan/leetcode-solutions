class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> {
        if(a[0]==b[0]) return b[1]-a[1];
        return a[0]-b[0];
    });
        int m=intervals.length;
        int start=intervals[0][0];
        int end=intervals[0][1];
        System.out.println(intervals);
        for(int i=1;i<intervals.length;i++){
            if(start<=intervals[i][0] && end >= intervals[i][1]){
                m--;
            } else {
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        return m;
        
    }
}