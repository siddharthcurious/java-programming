package com.learn.coding.LeetCode.leetcode22_generate_parentheses;

import java.util.*;

public class Solution {

    public boolean isValid(String data){
        Stack<Character> stack = new Stack<>();

        int length = data.length();
        int i = 0;

        while(i < length){
            char ch = data.charAt(i);
            if(ch == '('){
                stack.push('(');
            }
            else if(ch == ')'){
                if(stack.isEmpty()) return false;
                if(stack.peek() == '('){
                    stack.pop();
                }
                else {
                    stack.push(')');
                }
            }
            i++;
        }
        return stack.isEmpty();
    }

    public void permute(int length, String choosen, Set<String> output){
        if(length == 0){
            if(this.isValid(choosen)){
                output.add(choosen);
            }
        }

        if(length < 0){
            return;
        }
        permute(length-1, choosen+")", output);
        permute(length-1, choosen+"(", output);
    }

    public List<String> generateParenthesis(int n) {
        int length = 2*n;
        Set<String> output = new HashSet<>();
        permute(length, "", output);
        return new LinkedList<>(output);
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        int n = 3;
        List<String> data = solution.generateParenthesis(n);
        System.out.println(data);
    }
}
