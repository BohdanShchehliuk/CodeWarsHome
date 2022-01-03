package Snail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {
    public static void main(String[] arg) {
        int[][] array
                = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(Arrays.toString(snail(array)));
    }

    public static List<Integer> snailTemp(int[][] array, List<Integer> list) {
        int[][] arrTemp;
        if (array.length == array[0].length) {
            arrTemp = new int[array.length][array[0].length - 1];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i == 0) {
                        list.add(array[i][j]);
                    } else {
                        arrTemp[j][i - 1] = array[i][(array[0].length - 1) - j];
                    }
                }
            }

        } else {
            arrTemp = new int[array.length - 1][array[0].length];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i == 0) {
                        list.add(array[i][j]);
                    } else {
                        arrTemp[j][i - 1] = array[i][(array[0].length - 1) - j];
                    }
                }
            }
        }
        array = arrTemp;
        if (array.length == 0) {
            return list;
        }
        snailTemp(array, list);
        return list;
    }

    public static int[] snail(int[][] array) {
        List<Integer> list = new ArrayList<>();

        list = snailTemp(array, list);

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
