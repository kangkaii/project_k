package kk.practise.保留最大的数;

import java.util.Scanner;

/**
 * @author kangkai on 2017/11/1.
 */
public class Demo03 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                StringBuilder yy = new StringBuilder();
                yy.append(sc.next());
                int cnt = sc.nextInt();
                int count = 0;
                while (count < cnt) {
                    int len = yy.length() -1;
                    int s = 0;
                    while (s < len && yy.codePointAt(s) >= yy.codePointAt(s+1)){
                        s++;
                    }
                    yy.deleteCharAt(s);
                    count++; //记录删除个数
                }
                System.out.println(yy);
            }
        }
}
