class Solution {
    public static int gcd(int a,int b)
    {
        int max = 1;
        for(int i=2;i<=b;i++)
        {
            if(a%i == 0  && b%i == 0)
            {
                max = Math.max(max,i);
            }
        }
        return max;
    }
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))
        {
            return "";
        }
        int n = str1.length();
        int m = str2.length();
        int gcd = gcd(n,m);
        System.out.print(gcd);
        return str1.substring(0,gcd);
    }
}