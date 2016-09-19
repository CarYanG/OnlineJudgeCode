package others;

import java.util.Scanner;

/**
 * Created by carl on 2016/9/17.
 */
public class other513 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){

            String a=sc.nextLine().toString();
            String numbers[]=a.split(",");
            int num[]=new int[numbers.length];
            for(int i=0;i<numbers.length;i++){
                num[i]=Integer.valueOf(numbers[i]);
            }

            function(num);


        }
    }

    static void function(int num[]){

        int max=0;
        for(int i=0;i<num.length;i++){

            for(int j=i+1;j<num.length;j++){
                if(num[j]-num[i]>max){
                    max=num[j]-num[i];
                }
            }

        }
        System.out.println(max);

    }
}
/**
 * 题目描述：
 假如一个数组中存储了一个股票，在一天交易窗口内各时间点的股票价格（正整数）。只允许一次买入和一次卖出，请提供一个算法，计算出通过卖出和买入可以得到的最大利润
 输入
 价格序列，用,号隔开
 输出
 最大的可能利润

 样例输入
 2,3,2,4
 样例输出
 2


 */