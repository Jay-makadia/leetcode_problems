class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        int left = 0;
        int right = n - 1;
        char[] arr = s.toCharArray();
        
        while (left < right) {
            // Move left index to the next vowel
            while (left < right && !isVowel(arr[left])) {
                left++;
            }

            // Move right index to the previous vowel
            while (left < right && !isVowel(arr[right])) {
                right--;
            }

            // Swap vowels
            if (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                
                left++;
                right--;
            }
        }
        
        return new String(arr);
    }

    // Helper method to check if a character is a vowel
    private boolean isVowel(char c) {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='u')
        {
            return true;
        }
        return false;
    }
}
