class Solution {
    public int maxOperations(int[] nums, int k) {
        int left = 0;
        int right = nums.length-1;
        int count=0;
        Arrays.sort(nums);
        while(left<right)
        {
            int temp = nums[left]+nums[right];
            if(temp == k)
            {
                count++;
                left++;
                right--;
            }
            else if(temp<k)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return count;
    }
}