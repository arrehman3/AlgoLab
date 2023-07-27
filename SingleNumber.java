import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> temp= new ArrayList<Integer>();
        int temp1=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    temp.add(nums[i]);
                }
                // if(j==nums.length-1)
                // {
                //     if(!temp.contains(nums[i]))
                //     {
                //         temp1 = nums[i];
                //     }
                // }
            }

            if(!temp.contains(nums[i]))
                {
                    temp1 = nums[i];
                }
                
            
        }
        return temp1;
    }    
}

