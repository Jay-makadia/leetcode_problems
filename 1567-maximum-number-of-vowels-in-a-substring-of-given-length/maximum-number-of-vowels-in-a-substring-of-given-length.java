class Solution {
    public int maxVowels(String s, int k) {
        int vowel = 0;
        for(int i=0;i<k;i++) {
            if(isVowel(s.charAt(i))) vowel++;
        }
        int max = vowel;
        for(int i=k;i<s.length();i++) {
            if(isVowel(s.charAt(i))) vowel++;
            if(isVowel(s.charAt(i-k))) vowel--;
            max = Math.max(max,vowel);
        }
        return max;
    }
    public boolean isVowel(char ch) {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            return true;
        return false;
    }
}