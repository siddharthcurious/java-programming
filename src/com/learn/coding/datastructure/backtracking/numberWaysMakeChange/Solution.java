package com.learn.coding.datastructure.backtracking.numberWaysMakeChange;

public class Solution {
    public void makeChange(int[] denomination, int amt, String data){
        if( amt < 0) return;
        if(amt == 0){
            System.out.println(data);
            return;
        }
        for (int coin : denomination)
            makeChange(denomination, amt - coin, data + Integer.toString(coin) + ",");
    }

    public void getChange(int [] denomination, int amount){
        this.makeChange(denomination, amount, "");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int amount = 10;
        int [] denomination = {1, 5, 10, 25};
        solution.getChange(denomination, amount);
    }
}
