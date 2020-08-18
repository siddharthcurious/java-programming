package com.learn.coding.LeetCode.leetcode1122;

import java.util.*;

class RelativeComparator implements Comparator<Integer> {

    private final HashMap<Integer, Integer> indexMap;

    public RelativeComparator(HashMap<Integer, Integer> indexMap){
        this.indexMap = indexMap;
    }

    @Override
    public int compare(Integer a, Integer b){
        if(this.indexMap.get(a) > this.indexMap.get(b)) return 1;
        else if(this.indexMap.get(a) < this.indexMap.get(b)) return -1;
        return 0;
    }
}

class Solution {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        HashMap<Integer, Integer> indexMap = new HashMap<>();

        for(int i=0; i<arr2.length; i++){
            indexMap.put(arr2[i], i);
        }

        List<Integer> dont = new ArrayList<>();
        List<Integer> have = new ArrayList<>();

        for (int value : arr1) {
            if (!indexMap.containsKey(value)) {
                dont.add(value);
            }
            else have.add(value);
        }

        Collections.sort(dont);
        have.sort(new RelativeComparator(indexMap));

        int count = 0;
        for(Integer e: have){
            arr1[count++] = e;
        }

        for(Integer e: dont){
            arr1[count++] = e;
        }

        return arr1;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int []arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int []arr2 = {2,1,4,3,9,6};

        int []res = solution.relativeSortArray(arr1, arr2);

        System.out.println(Arrays.toString(res));
    }
}


