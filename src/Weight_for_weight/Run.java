package Weight_for_weight;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        orderWeight("103 101 4444 99 2000");
    }
    public static String orderWeight(String strng) {
        if (strng.equals(null)) {
            return strng;
        }
        String[] arrNumber = strng.split(" ");
        int[] val = new int[arrNumber.length];
        for (int j = 0; j < arrNumber.length; j++) {
            int sum = 0;
            for (int i = 0; i < arrNumber[j].length(); i++) {
                char temp = arrNumber[j].charAt(i);
                if (Character.isDigit(temp)) {
                    int b = Integer.parseInt(String.valueOf(temp));
                    sum = sum + b;
                } else {
                    return null;
                }
                val[j] = sum;
            }
        }
        System.out.println(Arrays.toString(arrNumber));
        System.out.println(Arrays.toString(val));
        String[] arrFinal = new String[arrNumber.length];

        for (int j = 0; j < arrNumber.length; j++) {
            int max = val[0];
            int temporary;
            String temt;
            for (int i = 1; i < arrNumber.length - j; i++) {
                if (val[i]==max) {
                    if (arrNumber[i].compareTo(arrNumber[i-1])>0){
                        max = val[i];
                        temt = arrNumber[i - 1];
                        arrNumber[i - 1] = arrNumber[i];
                        arrNumber[i] = temt;
                    }
                }
                if (val[i] < max) {
                    temporary = val[i];
                    val[i] = max;
                    val[i - 1] = temporary;
                    temt = arrNumber[i - 1];
                    arrNumber[i - 1] = arrNumber[i];
                    arrNumber[i] = temt;
                }
                if (val[i] > max) {
                    max = val[i];
                }

            }
        }
        System.out.println("dd" + Arrays.toString(val));
        System.out.println("ddd" + Arrays.toString(arrNumber));
        strng=arrNumber[0];
        for (int i = 1;i< arrNumber.length;i++){
            strng = strng+" "+arrNumber[i];
        }
       System.out.println(strng);
        return strng;
    }
}
