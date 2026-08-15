class Solution {
    public boolean isPalindrome(String s) {
        String st=s.toLowerCase().replaceAll("[^a-z0-9]","");
        System.out.println(st);
        char ch[] = st.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<=j){
            if(ch[i]!=ch[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}