
import java.util.*;

public class ooo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        Collections.addAll(list,12,45,78,98);

        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        Integer[] x = list.toArray(new Integer[list.size()]);

        for (Integer integer : x) {

            System.out.println(integer);
        }

    }
}
