package com.learn.coding.LeetCode.leetcode46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {

    public void permuteHelper(List<List<Integer>> res, List<Integer> input, List<Integer> choosen){
        if(input.isEmpty()){
            List<Integer> permutation = new LinkedList<>();
            permutation.addAll(choosen);
            res.add(permutation);
        }

        for(int i = 0; i < input.size(); i++){

            int num = input.get(i);
            choosen.add(num);
            input.remove(i);

            permuteHelper(res, input, choosen);

            choosen.remove(choosen.size()-1);
            input.add(i, num);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        List<Integer> choosen = new LinkedList<>();
        List<Integer> input = new ArrayList<>();
        for (int num : nums) {
            input.add(num);
        }
        permuteHelper(ans, input, choosen);
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] nums = {1,2,3};
        List<List<Integer>> ans = solution.permute(nums);
        System.out.println(ans);
    }
}
