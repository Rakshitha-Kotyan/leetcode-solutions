class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int icecream=0;
        Arrays.sort(costs);
        int first=costs[0];
        if(first>coins) return icecream;
        for(int i=0;i<costs.length;i++){
            if(coins >= costs[i]){
                icecream++;
                coins-=costs[i];
            }
        }
      return icecream;  
    }
}