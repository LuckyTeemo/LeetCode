package Teeemo.LeetCode;

import java.util.HashMap;

public class LeetCode_1 {
    /**
     * 给定一个整数型数组和一个目标整数target，找出数组中是否存在元素相加等于目标值，若存在，返回元素下标值
     * ex：[6,16,26,36]    target:52
     */

    public int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])){
                return new int[]{hashMap.get(target-nums[i]),i};
            }
            hashMap.put(nums[i],i);
        }
        return new int[0];
    }
}
