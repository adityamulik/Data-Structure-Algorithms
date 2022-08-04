package com.search;

public class MaxRepetitionsInArray {
    
    int[] arr;

    public MaxRepetitionsInArray(int[] arr) {
        this.arr = arr;
    }

    public int maxRepetition() {
        int max = 0;
        int maxIndex = arr.length; 
        int n = arr.length;

        for (int i=0; i < n; i++) {
            arr[arr[i] % n] += n;
        }

        for (int i=0; i < n; i++) {
            if (arr[i] / n > max) {
                max = arr[i] / n;
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
