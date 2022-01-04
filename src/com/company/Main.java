package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        for (long[] tm : removNb(26)
        ) {
            System.out.print(Arrays.toString(tm) + " ");
        }
        ;
    }

    public static List<long[]> removNb(long n) {
        List<long[]> list = new ArrayList<>();

        long s = n * (1 + n) / 2;

long b;
        for (long i = n/2; i <= n; i++) {

            b = (s-i)/(i+1);
            if (s - i-b==i*b){
                list.add(new long[]{i, b});

            }

        }
        return list;
    }
}
