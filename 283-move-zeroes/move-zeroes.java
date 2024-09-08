class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int arr[] = new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                arr[j] = nums[i];
                j++;
            }
            else
            {
                count++;
            }
        }
        while(count!=0)
        {
            arr[j]=0;
            j++;
            count--;
        }
        for(int i=0;i<n;i++)
        {
            nums[i] = arr[i];
        }
    }
}