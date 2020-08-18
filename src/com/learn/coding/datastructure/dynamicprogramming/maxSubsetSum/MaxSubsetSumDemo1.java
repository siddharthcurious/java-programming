package com.learn.coding.datastructure.dynamicprogramming.maxSubsetSum;

class MaxSubsetSum {

    public int maxSubsetSum(int [] numbers){
        if(numbers.length == 0) return 0;
        if(numbers.length == 1) return numbers[0];

        int second = numbers[0];
        int first = Math.max(second, numbers[1]);

        for(int i = 2; i < numbers.length; i++){
            int current = Math.max(first, second + numbers[i]);
            second = first;
            first = current;
        }
        return first;
    }
}

public class MaxSubsetSumDemo1 {
    public static void main(String[] args) {

        MaxSubsetSum maxSubsetSum = new MaxSubsetSum();
        int [] numbers = {7, 3, 20, 25, 11, 20, 41};
        int r = maxSubsetSum.maxSubsetSum(numbers);
        System.out.println(r);
    }
}
