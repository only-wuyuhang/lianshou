

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ll {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        //集合转数组
        Integer[] array = list.toArray(new Integer[list.size()]);


        String atr = new String();


        for (Integer integer : array) {
            System.out.println(integer);
        }

        //数组转集合
        List<Integer> list1 = Arrays.asList(array);


        System.out.println("打钩");
        System.out.println("导购");
        System.out.println("歇够");
        System.out.println("改邪归正");
        System.out.println("二哈");
        System.out.println("3哈");
        System.out.println("4哈");
        System.out.println("5哈");
        System.out.println("6哈");




    }

}
