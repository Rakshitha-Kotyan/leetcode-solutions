class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int l = s.length();
        if(l<2) return false;
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            } else {
                if(st.isEmpty()){
                    return false;
                }
                char rem=st.pop();
                if((ch ==')' && rem !='(') ||(ch ==']' && rem !='[') || (ch =='}' && rem !='{')){
                    return false;
                }
            }
        }
       return st.isEmpty(); 
    }
}