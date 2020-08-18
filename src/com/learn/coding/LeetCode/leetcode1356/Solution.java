package com.learn.coding.LeetCode.leetcode1356;

import java.util.Arrays;
import java.util.Comparator;

class Bits {

    public int getNumSetBit(int N){

        int count = 0;
        while(N > 0){
            N = N & (N-1);
            count++;
        }
        return count;
    }
}

class CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer number1, Integer number2){
        Bits bits = new Bits();
        int a = bits.getNumSetBit(number1);
        int b = bits.getNumSetBit(number2);

        if(number1 == number2) return 0;
        else if(a > b) return 1;
        else if(a == b) {
            if(number1 > number2) return 1;
            else if(number1 < number2 ) return -1;
            else return 0;
        }
        else if( a < b) return -1;
        return 0;
    }
}

class Solution {

    public int[] sortByBits(int[] arr) {

        Integer [] e = new Integer[arr.length];
        for (int i=0;i<arr.length;i++) {
            e[i] = arr[i];
        }

        Arrays.sort(e, new CustomComparator());
        int [] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            ans[i] = e[i];
        }
        return ans;
    }

     public static void main(String[] args) {
         Solution solution = new Solution();
         int []A = { 1,2,3,4,5,6,7};
         int [] ans = solution.sortByBits(A);
         System.out.println(Arrays.toString(ans));
     }
}