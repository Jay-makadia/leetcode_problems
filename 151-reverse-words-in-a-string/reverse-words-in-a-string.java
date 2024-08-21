class Solution {
    public String reverseWords(String s) {
        String arr[] = s.trim().split("\\s+");
        int n = arr.length;
        String ans = "";
        for(int i=n-1;i>0;i--)
        {
            ans = ans + arr[i] + " ";
        } 
          
        return ans + arr[0];    
    }
}