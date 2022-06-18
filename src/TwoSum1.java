/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.

You can return the answer in any order.
 */

import java.util.HashMap;
import java.util.Map;


public class TwoSum1 {
    public static void main(String[] args) {

    }

    public static int[] twoSum(Integer[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; map.put(nums[i], ++i))
            if (map.containsKey(target - nums[i]))
                return new int[]{map.get(target - nums[i]),i+1};
        return new int[]{0,0};
        
    }

}
