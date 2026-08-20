class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> a1= new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();

        a1.add(nums[0]);
        a2.add(nums[1]);
        int i=0;
        int j=0;
        for(int k=2;k<n;k++){
            if(a1.get(i)>a2.get(j)){
                a1.add(nums[k]);
                i++;
            } else {
                a2.add(nums[k]);
                j++;
            }
            
        }
        int y=0;
        for(int x=0;x<a1.size();x++){
            nums[y]=a1.get(x);
            y=y+1;
        }

        for(int x=0;x<a2.size();x++){
            nums[y]=a2.get(x);
            y=y+1;
        }

        return nums;
        
    }
}