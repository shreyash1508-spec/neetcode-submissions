class Solution {
    public int majorityElement(int[] nums) {
    int res = 0, c = 0;
    for(int i = 0; i<nums.length; i++)
    {
        if(c==0)
            res = nums[i];

        if(res==nums[i])
            c++;
        else c--;
    }

    return res;
    }
    }
