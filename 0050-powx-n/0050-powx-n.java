class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        if (n == 1) {
            return x;
        }
        if (n < 0) {
            x = 1.0 / x;
            // Handle integer overflow for -Integer.MIN_VALUE
            if (n == Integer.MIN_VALUE) {
                n += 2;
            }
            n = -n;
        }
        double halfPow = myPow(x, n / 2);
        if (n % 2 == 0) {
            return halfPow * halfPow;
        } else {
            return x * halfPow * halfPow;
        }
    }
}
