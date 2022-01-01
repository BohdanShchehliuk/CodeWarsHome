import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        System.out.println(groupCheck("({"));
    }

    static boolean groupCheck(String s) {
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '[' || s.charAt(i) == ']' ||
                    s.charAt(i) == '{' || s.charAt(i) == '}')
                list.add(s.charAt(i));
        }

        if (list.size()%2!=0)
            return false;
        for (int j = 0; j<list.size()/2;j++) {
            if (list.size()==0) return true;
            int i =0;
            while (i<list.size()-1) {
                if ((list.get(i) == '(' && list.get(i + 1) == ')')||
                (list.get(i) == '[' && list.get(i + 1) == ']')||
                (list.get(i) == '{' && list.get(i + 1) == '}')) {
                    list.remove(i);
                    list.remove(i);
                    if (list.size()==0) return true;
                    i=0;
                } else{
                    i++;}
            }

        }
        if (list.size()==0) return true;
        return false;
    }
}



