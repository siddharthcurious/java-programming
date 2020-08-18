package com.learn.coding.LeetCode.leetcode239;

import java.util.*;

class Pair {
    public int index;
    public int val;

    public Pair(int index, int val){
        this.index = index;
        this.val = val;
    }
}

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        List<Integer> result = new ArrayList<>();
        Deque<Pair> deque = new LinkedList<>();

        int i = 0;
        int j = k - 1;
        while(i <= j && j < nums.length) {

            while(i <= j){
                if(deque.isEmpty()){
                    deque.add(new Pair(i, nums[i]));
                    i++;
                }
                else {
                    if(deque.peekFirst().val < nums[i]){
                        deque.pollFirst();
                        deque.add(new Pair(i, nums[i]));
                        i++;
                    }
                }
            }

            result.add(deque.peekLast().val);
            i++;
            j++;
        }
        return null;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int [] nums = { 1,3,-1,-3,5,3,6,7 };
        int k = 3;
        int [] res = solution.maxSlidingWindow(nums, k);

        System.out.println(Arrays.toString(res));
    }
}
