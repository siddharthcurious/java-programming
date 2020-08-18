package com.learn.coding.LeetCode.leetcode22_generate_parentheses;

import java.util.LinkedList;
import java.util.List;

public class SolutionOptiomized {

    public void getTheStrings(List<String> ans, String curr, int open, int close, int max){

        if(curr.length() == 2*max){
            ans.add(curr);
        }

        if(open < max){
            getTheStrings(ans, curr+'(', open+1, close, max);
        }

        if(close < open){
            getTheStrings(ans, curr+')', open, close+1, max);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new LinkedList<>();
        getTheStrings(ans, "",0, 0, n);
        return ans;
    }

    public static void main(String[] args) {

        SolutionOptiomized solution = new SolutionOptiomized();
        List<String> ans = solution.generateParenthesis(4);
        System.out.println(ans);

    }
}
