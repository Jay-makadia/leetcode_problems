class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length-k+1;i++)
        {
            int temp = 0;
            for(int j=i;j<i+k;j++)
            {
                temp += nums[j];
            }
            max = Math.max(max,temp);
        }
        double ans = (double) max/k;
        return ans;
    }
}