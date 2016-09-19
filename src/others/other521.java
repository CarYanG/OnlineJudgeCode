package others;

import java.util.Scanner;

/**
 * Created by carl on 2016/9/18.
 */
public class other521 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String input[]=sc.nextLine().toString().split(" ");
            int numbers[]=new int[input.length];
            for(int i=0;i<input.length;i++){
                numbers[i]=Integer.valueOf(input[i]);
            }

            function(numbers);

        }


    }

    static void function(int numbers[]){
        if(numbers.length<=3)
            System.out.println("0");


    }

}

/**
 * 在一个二元平面坐标上，一个点初始在坐标[0,0]，
 *
 * 给定一个正整数数组，该点将顺序按照数组中的元素依次向坐标平面的上左下右移动，
 *
 * 例如给定数组[1,2,3,4,5,6]，则该店的移动顺序为，向上移动1，向左移动2，向下移动3，向右移动4，向上移动5，向左移动6。
 *
 * 要求判断给定一个数组m，该点的移动轨迹是否会相交。
 输入
 输入数据有多组，每组占一行，每行为一个数组，使用空格分割
 输出
 对于每个测试实例，要求返回1或者0，如果移动轨迹会相交，则返回1，否则返回0。

 样例输入
 1 2 3 4 5 6
 1 1 1 1
 样例输出
 0
 1

 */
