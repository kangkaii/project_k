package kk.practise.能力值的乘积;

import java.util.Scanner;

/**
 * @author kangkai on 2017/11/3.
 */
public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();//一共n个人
        int[] array = new int[n];//编号数组
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        int k = scan.nextInt();//选出来k个人
        int d = scan.nextInt();//编号不超过d

        int x = array[0];
        for (int i = 1; i < n-1; i++) {
            if (array[i] - array[i-1] < d || array[i-1] - array[i] < d) {//相邻两个学生的位置编号的差不超过 d
                //求 x（乘积）
                //x = x * array[i]>x?x * array[i];
            }
        }

    }

}
