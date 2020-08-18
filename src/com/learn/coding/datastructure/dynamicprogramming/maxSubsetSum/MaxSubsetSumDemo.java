package com.learn.coding.datastructure.dynamicprogramming.maxSubsetSum;

class Solution {

    public int maxSubsetSum( int [] numbers){
        if(numbers.length == 0) return 0;
        if(numbers.length == 1) return numbers[0];
        int [] maxSum = new int[numbers.length];
        maxSum[0] = numbers[0];
        maxSum[1] = Math.max(numbers[0], numbers[1]);

        for(int i = 2; i < numbers.length; i++){
            maxSum[i] = Math.max(maxSum[i-1], maxSum[i-2] + numbers[i]);
        }
        return maxSum[numbers.length-1];
    }
}

public class MaxSubsetSumDemo {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] numbers = {7, 3, 20, 25, 11, 20, 41};
        int r = solution.maxSubsetSum(numbers);
        System.out.println(r);
    }
}
