class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int n = word1.length();
        int m = word2.length();
        int j=0,k=0;
        int i = 0;
        while(i<Math.min(n,m))
        {
            if(j<n)
            {
                ans += word1.charAt(j);
                j++;
            }
            if(k<m)
            {
                ans += word2.charAt(k);
                k++;
            }
            i++;
        }
        while(j<n)
        {
            ans += word1.charAt(j);
            j++;
        }
        while(k<m)
        {
            ans += word2.charAt(k);
            k++;
        }
        return ans;
    }
}