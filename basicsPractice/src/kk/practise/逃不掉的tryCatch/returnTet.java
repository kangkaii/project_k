package kk.practise.逃不掉的tryCatch;

/**
 * @author kangkai on 2017/10/25.
 */
public class returnTet {

    public static void main(String[] args) {
        System.out.println(test1());
        System.out.println(test2());
        System.out.println(test3());
        System.out.println(test4());
        System.out.println(test5());
        System.out.println(test6());
    }

    /**
     * 有异常抛出情况、try、catch、finally均有return语句
     * @return 2
     */
    public static int test1() {
        int x  = 0;
        try {
            int i = 0;
            int j = 1;
            int k = j / i;
            return x;
        } catch (Exception e) {
            x = 1;
            return x;
        } finally {
            x = 2;
            return x;
        }
    }

    /**
     * 无异常抛出情况、try、catch、finally均有return语句
     * @return 2
     */
    public static int test2() {
        int x = 0;
        try {
            int i = 0;
            int j = 1;
            return x;
        } catch (Exception e) {
            x = 1;
            return x;
        } finally {
            x = 2;
            return x;
        }
    }

    /**
     * 有异常抛出，try、catch均有return语句
     * @return 1
     */
    public static int test3() {
        int x = 0;
        try {
            int i = 0;
            int j = 1;
            int k = j / i;
            return x;
        } catch (Exception e) {
            x = 1;
            return x;
        } finally {
            x = 2;
        }
    }
    /**
     * 无异常抛出，try、catch均有return语句（以try的return为准）
     * @return 0
     */
    public static int test4() {
        int x = 0;
        try {
            int i = 0;
            int j = 1;
            return x;
        } catch (Exception e) {
            x = 1;
            return x;
        } finally {
            x = 2;
        }
    }
    /**
     * 无异常抛出，try、方法最后均有return语句（以try的return为准）
     * @return 0
     */
    public static int test5() {
        int x = 0;
        try {
            int i = 0;
            int j = 1;
            return x;
        } catch (Exception e) {
            x = 1;
        } finally {
            x = 2;
        }

        return x;
    }

    /**
     * 有异常抛出，try、方法最后均有return语句（以最后的return为准，并且catch、finally中修改起作用）
     * @return 2
     */
    public static int test6() {
        int x = 0;
        try {
            int i = 0;
            int j = 1;
            int k = j / i;
            return x;
        } catch (Exception e) {
            x = 1;
        } finally {
            x = 2;
        }
        return x;
    }









}
