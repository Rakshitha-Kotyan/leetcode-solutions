
class Solution {
    public int myAtoi(String s) {
       
        s = s.trim();
        int result = 0, sign = 1, i = 0;
        int n = s.length();
        if(n == 0) return 0;
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        } else if(s.charAt(i)=='+'){
            i++;
        }

        while(i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if(result > Integer.MAX_VALUE / 10 || 
              (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
