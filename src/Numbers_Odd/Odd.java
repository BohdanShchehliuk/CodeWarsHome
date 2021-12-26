package Numbers_Odd;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Odd {
    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
    }

    public static int findIt(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1 || count == 3) {
                return arr[i];
            }
            int numb = 0;
            for (int k = 1; k < count; k++) {
                if (count % 2 == 1) {
                    numb++;
                }
                if (numb == 2) {
                    return arr[i];
                }

            }
        }
        return 0;
    }
}

