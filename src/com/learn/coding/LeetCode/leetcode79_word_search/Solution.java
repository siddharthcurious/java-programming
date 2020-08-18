package com.learn.coding.LeetCode.leetcode79_word_search;

public class Solution {

    private char [][] board;
    private int ROWS;
    private int COLS;

    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.ROWS = board.length;
        this.COLS = board[0].length;

        for(int r = 0; r < ROWS; r++){
            for(int c = 0; c < COLS; c++){
                if(this.backtrack(r, c, word, 0)) return true;
                return false;
            }
        }
        return false;
    }

    protected boolean backtrack(int r, int c, String word, int index){
        if(index >= word.length()) return true;
        if(r < 0 || r == this.ROWS || c < 0 | c == this.COLS || this.board[r][c] != word.charAt(index)) return false;

        boolean ret = false;

        this.board[r][c] = '#';

        int [] rowOffsets = {0, 1, 0, -1};
        int [] colOffsets = {1, 0, -1, 0};

        for(int o = 0; o < 4; o++){
            ret = this.backtrack(r + rowOffsets[o], c + colOffsets[o], word, index+1);
            if(ret) break;
        }

        this.board[r][c] = word.charAt(index);
        return ret;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        boolean t = solution.exist(board, word);
        System.out.println(t);
    }
}
