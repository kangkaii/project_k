package kk.practise.洗牌;
import java.util.Scanner;

public class Demo03{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        for(int i=0;i<T;i++){
            int n=in.nextInt();
            int k=in.nextInt();
            int[] number=new int[2*n];
            for(int j=0;j<2*n;j++){
                number[j]=in.nextInt();
            }
            int[] result=new int[2*n];
            for(int t=0;t<k;t++){
                for(int j=0;j<2*n;j++){
                    if(j%2==0){
                        result[j]=number[j/2];
                    }else{
                        result[j]=number[n+j/2];
                    }
                }
                for(int j=0;j<2*n;j++){
                    number[j]=result[j];
                }
            }
            System.out.print(result[0]);
            for(int j=1;j<result.length;j++){
                System.out.print(" "+result[j]);
            }
            System.out.println();
        }
    }
}