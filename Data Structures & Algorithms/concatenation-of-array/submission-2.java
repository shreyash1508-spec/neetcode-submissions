class Solution {
    public int[] getConcatenation(int[] nums) {

         if(nums.length<1 || nums.length>1000)
             return new int[]{-1};

         int ans[] = new int[2*nums.length];

         for(int i =0; i<nums.length; i++)
         {
                 ans[i] = ans[i+nums.length] = nums[i];
         }

        return ans;
    }
}