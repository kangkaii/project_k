package kk.practise.连续和最大;

import java.util.Scanner;

/**
 * @author kangkai on 2017/11/2.
 */
public class Main {

    //理解误区：-2 1 -3 4 -1 2 1 -5 的连续最大子数组是： 4 -1 2 1 而不是 4 -1（可以是多个连续的）
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scan.nextInt();
        }
        int sum = array[0];
        int max = array[0];
        for (int i = 1; i < length-1; i++) {
            if (sum < 0) {//小于0  直接舍弃（不可能存在 -2 1 -3....最大，一定 < 1 -3....）
                sum = array[i];
            }
            else {
                sum += array[i];
            }
            if (max < sum) {//实时记录：sum的峰值
                max = sum;
            }
        }
        System.out.println(max);
    }

}
