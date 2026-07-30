class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        if(n<9){
            return n;
        }
        int min=8;
        for(int i=8;i<word.length();i++){
            if(i<16){
                min+=2;
            } else if(i<24){
                min+=3;
            } else {
                min+=4;
            }

        }
        return min;
    }
}