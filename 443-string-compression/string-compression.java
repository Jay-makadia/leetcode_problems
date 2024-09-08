class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            int freq = 1;
            char temp = chars[i];
            while(i<n-1 && chars[i] == chars[i+1])
            {
                i++;
                freq++;
            }
            sb.append(temp);
            if(freq>1)
            {
                sb.append(freq);
            }
        }
        String s = sb.toString();
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            chars[i] = arr[i];
        }
        return arr.length;
    }
}