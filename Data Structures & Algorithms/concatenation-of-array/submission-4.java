class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length;

         if(n<1 || n>1000)
             return new int[]{-1};

         int ans[] = new int[n*2];

         for(int i =0; i<n; i++)
         {
                 ans[i] = ans[i+n] = nums[i];
         }

        return ans;
    }
}