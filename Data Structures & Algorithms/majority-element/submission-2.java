class Solution {
    public int majorityElement(int[] nums) {
   int res = 0, c = 0;
    for(int num : nums)
    {
        if(c==0)
            res = num;

        if(res==num)
            c++;
        else c--;
    }

    return res;
    }
    }
