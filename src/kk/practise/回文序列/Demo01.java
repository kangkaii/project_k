package kk.practise.回文序列;

import java.util.*;

/**
 * @author kangkai on 2017/11/7.
 */
public class Demo01 {

    public static void main(String[] ssdda) {

        ArrayList<String> list = new ArrayList<>(10);//9 6 5
        list.add("9");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("1");
        String[] a = new String[]{"1","2","3","4","111","11"};
        String[] x = new String[]{"1"};
        Object[] elementData = new Object[]{};
        Collection<String> c = new ArrayList<>();//9 6
        c.add("9");
        c.add("5");
        c.add("1");
        list.retainAll(c);
        System.out.println(list);
        /*String[] b = list.toArray(a);
        String[] y = list.toArray(x);
        System.out.println(Arrays.asList(b));
        System.out.println(Arrays.asList(y));*/





    }



}
