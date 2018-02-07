package kk.practise.头条的2017校招;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kangkai on 2017/11/2.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int length = scan.nextInt();//出好的题目的数量
            int[] array = new int[length];
            for (int i = 0; i < length; i++) {//难度系数 添加
                array[i] = scan.nextInt();
            }
            Arrays.sort(array);
            int t = 1;
            int count = 0;
            for (int i = 0; i < length-1;i++ ) {
                if (t != 3) {
                    if (array[i+1] - array[i] <= 10) {
                        t++;
                    }
                    else if( t == 1 && array[i+1] - array[i] <= 20) {
                        count++;
                        t = 3;//执行一次 i++;
                    }
                    else  {//t = 1 时，count+2----t = 2 时，count+1
                        count += 3-t;
                        t = 1;
                    }
                }
                else {t = 1;}
            }
            count += 3 - t;
            System.out.println(count);
        }
    }
}
