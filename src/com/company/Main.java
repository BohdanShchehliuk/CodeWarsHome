package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 2, 3};
        System.out.println(getPeaks(arr).values());

    }

    public static int lastNumb(int[] arr, int i) {
        int number = arr[i + 1];
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j - 1] != arr[j]) {
                return arr[j];
            }
        }
        return number;
    }

    ;

    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        List<Integer> listPeak = new ArrayList<>();
        List<Integer> listPos = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>();


        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > lastNumb(arr, i)) {
                listPeak.add(arr[i]);
                listPos.add(i);
            }
        }
        map.put("pos", listPos);
        map.put("peaks", listPeak);
        return map;
    }
}
