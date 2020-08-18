package com.learn.coding.LeetCode.leetcode1389;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list=new ArrayList();

        int l=nums.length;
        for(int i=0;i<l;i++){
            list.add(index[i],nums[i]);
        }

        for(int i=0;i<l;i++){
            nums[i]=list.get(i);
        }
        return nums;
    }

    public int[] createTargetArrayDup(int[] nums, int[] index) {

        int [] target = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            target[index[i]] = nums[i];
        }

        System.out.println(Arrays.toString(target));

        for(int i = 0; i < nums.length; i++){
            nums[i]=target[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int [] nums = {0,1,2,3,4};
        int [] index = {0,1,2,2,1};

        solution.createTargetArray(nums, index);

        solution.createTargetArrayDup(nums, index);
    }
}