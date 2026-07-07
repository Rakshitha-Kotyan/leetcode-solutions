class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb = new StringBuilder();
        long sum = 0;

        while (n > 0) {
            int digit = n % 10;
            if (digit != 0) {
                sb.append(digit);
                sum += digit;
            }
            n /= 10;
        }

        sb.reverse();

        long x = sb.length() == 0 ? 0 : Long.parseLong(sb.toString());

        return x * sum;
    }
}