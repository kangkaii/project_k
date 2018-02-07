package kk.practise.四种方法引用类型.特定实例对象的方法引用.类型上的实例方法引用;

/**
 * Created by kk on 2017/10/13.
 */
public class MyArrayOps {

    /**
    * Description:判断一个自定义类型的数组 有几个 v
    * @param: T array ,T v
    * @return count
    */
    public static <T> int countMatching(T[] als, T v) {
        int count = 0;
        for (int i = 0; i < als.length; i++) {
            if (als[i] == v) count++;
        }
        return count;
    }

}
