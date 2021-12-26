package Directions_Reduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dirReduc(new String[]{"North", "SoUTH", "SOUTH", "EAST", "WEST", "NORTH"})));
    }

    public static String[] dirReduc(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].toUpperCase();
        }
        List<String> list = new ArrayList<>();
        for (String tm : arr) {
            if (tm.equals("WEST") || tm.equals("EAST") || tm.equals("NORTH") || tm.equals("SOUTH")) {
                list.add(tm);
            }
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals("WEST") && list.get(i + 1).equals("EAST") ||
                    list.get(i).equals("EAST") && list.get(i + 1).equals("WEST") ||
                    list.get(i).equals("SOUTH") && list.get(i + 1).equals("NORTH") ||
                    list.get(i).equals("NORTH") && list.get(i + 1).equals("SOUTH")) {
                list.remove(i);
                list.remove(i);
                System.out.println(list);
                i--;
                if (i > -1) {
                    i--;
                }
            }
        }

        String[] arrFinal = new String[list.size()];
        int i = 0;
        for (String tm : list) {
            arrFinal[i] = tm;
            i++;
        }
        return arrFinal;
    }
}
