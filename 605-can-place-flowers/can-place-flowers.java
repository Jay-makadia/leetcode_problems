class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int i = 0;

        // Handle the case where the length of f is 1
        if (f.length == 1) {
            if (f[0] == 0) n--;
            return n <= 0;
        }

        // Check and place a flower at the start of the array
        if (f[0] == 0 && f[1] == 0) {
            f[0] = 1;
            n--;
            i = 1;  // Skip to the next valid position
        }

        // Check and place flowers in the middle of the array
        while (n > 0 && i < f.length - 2) {
            if (f[i] == 0 && f[i + 1] == 0 && f[i + 2] == 0) {
                f[i + 1] = 1;
                n--;
                i += 2; // Skip the next position to maintain the flower placement rule
            } else {
                i++;
            }
        }

        // Check and place a flower at the end of the array
        if (f[f.length - 2] == 0 && f[f.length - 1] == 0) {
            f[f.length - 1] = 1;
            n--;
        }

        return n <= 0;
    }
}
