package kk.practise.四种方法引用类型.静态方法引用.一;

import org.junit.Test;

/**
 * Created by  kk on 2017/10/12.
 */
public class MethodRefDemo {

    public static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    @Test
    public void test() {
        String inStr = "lambda add power to Java";
        //MyStringOps::strReverse 相当于实现了接口方法func()
        // 并在接口方法func()中作了MyStringOps.strReverse()操作
        String outStr = stringOp(MyStringOps::strReverse, inStr);
        String outStr2 = MyStringOps.strReverse(inStr);
        System.out.println("Original string: " + inStr);
        System.out.println("String reserved: " + outStr);
        System.out.println("String reserved: " + outStr2);
    }

}
