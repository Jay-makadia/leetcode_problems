class Solution {
    public boolean stoneGame(int[] piles) {
//         int left = 0;
//         int right = piles.length - 1;
//         int i =0;
//         int alice = 0;
//         int bob = 0;
//         while(left<right)
//         {
//             if(i%2 == 0)
//             {
//                 if(piles[left]==piles[right])
//                 {
//                     if(piles[left+1]>=piles[right-1])
//                     {
//                         alice += piles[right];
//                         right--;
//                     }
//                     else
//                     {
//                         alice += piles[left];
//                         left++;
//                     }
//                 }
//                 else if(piles[left]>piles[right])
//                 {
//                     alice += piles[left];
//                     left++;
//                 }
//                 else
//                 {
//                     alice += piles[right];
//                     right--;
//                 }
//             }
//             else
//             {
//                 if(piles[left]==piles[right])
//                 {
//                     if(piles[left+1]>=piles[right-1])
//                     {
//                         bob += piles[right];
//                         right--;
//                     }
//                     else
//                     {
//                         bob += piles[left];
//                         left++;
//                     }
//                 }
//                 else if(piles[left]>=piles[right])
//                 {
//                     bob += piles[left];
//                     left++;
//                 }
//                 else
//                 {
//                     bob += piles[right];
//                     right--;
//                 }
//             }
//             i++;
//         }
//         bob += piles[left];
//         System.out.println(alice +" "+bob);
//         if(alice > bob)
//         {
//             return true;
//         }
//         return false;
return true;
    }
}