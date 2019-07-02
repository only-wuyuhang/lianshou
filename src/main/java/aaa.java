

import java.util.ArrayList;
import java.util.Collections;

public class aaa {
    public static void main(String[] args) {
        String s = new String("13456");
        System.out.println(s);
        System.out.println("hahah");
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list,"asd","fgh","123","456");

        String[] strings = list.toArray(new String[list.size()]);

        for (String string : strings) {
            System.out.println(string);
        }

    }
}
