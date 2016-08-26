package others;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/8/17.
 *
 * 网易有道内推笔试 构造队列
 *
 * 参考约瑟夫环
 */
public class other502 {

    void printResult(int a){

        if(a==1){
            System.out.print("1");
            System.out.println();
        }
        else
        {
            int temp[]=new int[a];

            for(int i=0;i<a;i++){
                if((i+1)%2==0&&i+1<a){

                    temp[i]=(i+1)/2;
                }


            }


        }

    }


    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num=Integer.valueOf(in.nextLine());

        while(num>0){
            int a =Integer.valueOf(in.nextLine());

            new other502().printResult(a);

            num--;
        }
    }


}


/**
 * Time Limit: 4000/2000 MS (Java/Others) Memory Limit: 65536/65536 K (Java/Others)
 *
 Problem Description:
 小明同学把1到n这n个数字按照一定的顺序放入了一个队列Q中。现在他对队列Q执行了如下程序：
 while(!Q.empty())              //队列不空，执行循环
 {
  int x=Q.front();            //取出当前队头的值x
  Q.pop();                 //弹出当前队头
  Q.push(x);               //把x放入队尾
  x=Q.front();              //取出这时候队头的值
  printf("%d\n",x);          //输出x
  Q.pop();                 //弹出这时候的队头
 }
 做取出队头的值操作的时候，并不弹出当前队头。
 小明同学发现，这段程序恰好按顺序输出了1,2,3,...,n。现在小明想让你构造出原始的队列，你能做到吗？
 输入
 第一行一个整数T（T<=100）表示数据组数，每组数据输入一个数n（1<=n<=100000），输入的所有n之和不超过200000。
 输出
 对于每组数据，输出一行，表示原始的队列。数字之间用一个空格隔开，不要在行末输出多余的空格。

 样例输入
 4
 1
 2
 3
 10
 样例输出
 1
 2 1
 2 1 3
 8 1 6 2 10 3 7 4 9 5

 */

