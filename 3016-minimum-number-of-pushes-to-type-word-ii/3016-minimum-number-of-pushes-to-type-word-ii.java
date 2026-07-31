class Solution {
    public int minimumPushes(String word) {
        Integer freq[] = new Integer[26];
        Arrays.fill(freq, 0);
        int min=0;
        for(int i=0;i<word.length();i++){
            char c= word.charAt(i);
            freq[c-'a']++;
        }
        Arrays.sort(freq, (a,b)-> b-a);
        int i=0;
        while(i<26){
          if(freq[i]==0)  break;
          if(i<8){
            min+=freq[i]*1;
          } else if(i>=8 && i<16){
            min+=freq[i]*2;
          } else if(i>=16 && i<24){
            min+=freq[i]*3;
          } else {
            min+=freq[i]*4;
          }
          i++;
        }

        return min;

    }
}


