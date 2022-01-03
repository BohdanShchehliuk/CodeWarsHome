import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        System.out.println(validParentheses("(())"));
    }

    public static boolean validParentheses(String parens) {
        List<Character> list = new ArrayList<>();
        char[] arr = parens.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == ')') {
                list.add(arr[i]);
            }
        }
System.out.println(list);
        int i=0;
       while (i<list.size()-1){
            if (list.get(i) == '(' && list.get(i + 1) == ')') {
                list.remove(i);
                list.remove(i);
                System.out.println(list);
                i=0;
            } else i++;
        }
        return list.size() == 0 ? true : false;
    }
}
