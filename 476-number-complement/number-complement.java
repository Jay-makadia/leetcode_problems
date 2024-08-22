class Solution {
    // public static int pow(int a, int b) {
    //     int an = 1;
    //     for (int i = 0; i < b; i++) {
    //         an *= a;
    //     }
    //     return an;
    // }

    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        int n = s.length();

        // Using StringBuilder to modify the string
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < n; i++) {
            if (sb.charAt(i) == '1') {
                sb.setCharAt(i, '0');
            } else {
                sb.setCharAt(i, '1');
            }
        }

        // Convert the modified binary string back to an integer
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (sb.charAt(i) == '1') {
                ans += Math.pow(2, n - 1 - i); // Corrected the power calculation
            }
        }

        return ans;
    }
}
