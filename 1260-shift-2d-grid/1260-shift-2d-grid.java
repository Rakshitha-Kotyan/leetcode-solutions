class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        int m=grid.length;
        int n=grid[0].length;
        int s=n*m;
        k %= s;
        int flatten[]=new int[s];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                flatten[i*n+j]=grid[i][j];
            }
        }

        reverse(flatten,0,s-1);
        reverse(flatten,0,k-1);
        reverse(flatten,k,s-1);

        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<n;j++){
                l.add(flatten[i*n+j]);
            }
            res.add(l);
        }
        
        return res;
    }

    public static void reverse(int a[], int l, int r){
        while(l<r){
            int temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }
    }
}