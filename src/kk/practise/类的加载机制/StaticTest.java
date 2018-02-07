package kk.practise.类的加载机制;

/**
 * @author kangkai on 2018/1/22.
 */
public class StaticTest
{
    static StaticTest st = new StaticTest();

    static
    {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    StaticTest()
    {
        System.out.println("3");
        System.out.println("a="+a+",b="+b);
    }

    public static void staticFunction(){
        System.out.println("4");
    }

    int a=110;
    static int b =112;

    public static void main(String[] args)
    {
        staticFunction();
        System.out.println(b);
        //输出什么
        //首先 类初始化了。
        //遇到 static StaticTest st = new StaticTest(); 初始化了它。并发现需要实例化的时候
         // 就去实例化（初始化被打断）
        //以下代码执行
        /*{
            System.out.println("2");
        }

        StaticTest()
        {
            System.out.println("3");
            System.out.println("a="+a+",b="+b);
        }*/
        //输出 2 输出 3（可以看到 a 的声明虽然在 使用后，但是并没有报错--->成员变量赋值和块赋值应该是没有先后顺序的，先声明先执行）
        //再输出 a=110 b= 0 （初始化被打断了）
        //然后是 静态代码块加载与静态成员变量的赋值
        //输出 1 （如果此时继续输出 b ，b已经变成了 112）
        //最后输出 4
    }
}
