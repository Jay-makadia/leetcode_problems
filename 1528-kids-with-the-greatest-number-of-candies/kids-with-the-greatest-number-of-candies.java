class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ll = new ArrayList<>();
        int max = 0;
        for(int i=0;i<candies.length;i++)
        {
            max = Math.max(max,candies[i]);
        }
        for(int i=0;i<candies.length;i++)
        {
            int temp = candies[i] + extraCandies;
            if(temp >= max)
            {
                ll.add(true);
            }
            else
            {
                ll.add(false);
            }
        }
        return ll;
    }
}