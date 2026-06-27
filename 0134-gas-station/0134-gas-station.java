class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tGas=0;
        int tCost=0;
        int tank=0;
        int startIndex=0;

        for(int i=0;i<gas.length;i++){
            tGas+=gas[i];
            tCost+=cost[i];
            tank+=gas[i]-cost[i];

            if(tank<0){
                tank=0;
                startIndex=i+1;
            }

            
        }
        if(tGas<tCost) return -1;
            return startIndex;
        
    }
}