package kk.practise.循环return的结果;

/**
 * @author kangkai on 2018/1/2.
 */
public class Demo01 {

    public static void main(String[] args) {
        System.out.println(test());
    }
    private static int test() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println(i);
            return i;//return 一次之后 直接跳出循环
        }
        return 100;
    }


}
