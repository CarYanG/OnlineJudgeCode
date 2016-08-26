package others;

/**
 * Created by Administrator on 2016/8/17.
 *
 * 网易有道内推笔试  模拟洗牌的过程
 */
import java.util.Scanner;
public class other501 {

    void printResult(int cards[],int cishu){
        int fenzulength=cards.length/2;

        int temp1[]=new int[fenzulength];
        int temp2[]=new int[fenzulength];

        for(int i=0;i<fenzulength;i++){
            temp1[i]=cards[i];
            temp2[i]=cards[fenzulength+i];
        }


        int result[]=new int[cards.length];

        while(cishu>0){
            for(int i=0,m=0;i<cards.length&&m<fenzulength;i++){
                if(i%2==0){
                    result[i]=temp1[m];
                }
                else
                {
                    result[i]=temp2[m];
                    m++;
                }


            }

            for(int j=0;j<fenzulength;j++){
                temp1[j]=result[j];
                temp2[j]=result[fenzulength+j];
            }
            cishu--;

        }

        for(int i=0;i<result.length-1;i++){
            System.out.print(result[i]+" ");
        }
        System.out.println(result[result.length-1]);


    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int zushu=Integer.valueOf(in.nextLine().toString());

        while(zushu>0){
            String temp[]=in.nextLine().split(" ");
//            System.out.println("number:"+temp.length);
            int paishu=2* Integer.valueOf(temp[0]);
            int cishu=Integer.valueOf(temp[1]);

            int cards[]=new int[paishu];
            String temp_card[]=in.nextLine().split(" ");
            for(int i=0;i<temp_card.length;i++){
                cards[i]=Integer.valueOf(temp_card[i]);
            }

            new other501().printResult(cards,cishu);

            zushu--;
        }
    }

}

/**
 * Time Limit: 2000/1000 MS (Java/Others) Memory Limit: 65536/65536 K (Java/Others)
 Problem Description:
 洗牌在生活中十分常见，现在需要写一个程序模拟洗牌的过程。
 现在需要洗2n张牌，从上到下依次是第1张，第2张，第3张一直到第2n张。
 首先，我们把这2n张牌分成两堆，左手拿着第1张到第n张（上半堆），右手拿着第n+1张到第2n张（下半堆）。
 接着就开始洗牌的过程，先放下右手的最后一张牌，再放下左手的最后一张牌，接着放下右手的倒数第二张牌，
 再放下左手的倒数第二张牌，直到最后放下左手的第一张牌。接着把牌合并起来就可以了。
 例如有6张牌，最开始牌的序列是1,2,3,4,5,6。
 首先分成两组，左手拿着1,2,3；右手拿着4,5,6。在洗牌过程中按顺序放下了6,3,5,2,4,1。
 把这六张牌再次合成一组牌之后，我们按照从上往下的顺序看这组牌，就变成了序列1,4,2,5,3,6。
 现在给出一个原始牌组，请输出这副牌洗牌k次之后从上往下的序列。

 输入
 第一行一个数T(T<=100)，表示数据组数。对于每组数据，第一行两个数n,k(1<=n,k<=100)，
 接下来一行有2n个数a1,a2,...,a2n(1<=ai<=1000000000)。表示原始牌组从上到下的序列。

 输出
 对于每组数据，输出一行，最终的序列。数字之间用空格隔开，不要在行末输出多余的空格。

 样例输入
 3
 3 1
 1 2 3 4 5 6
 3 2
 1 2 3 4 5 6
 2 2
 1 1 1 1
 样例输出
 1 4 2 5 3 6
 1 5 4 3 2 6
 1 1 1 1

 */

/**
 *  每次读取一个数之后，算出他经过k次洗牌后的位置，只用一个长度为2n数组用来输出
 * 根据当前数的位置，可以算出经过一次洗牌后的位置
 * 如果当前数小于等于n（即在左右），则他下次出现的位置是 2*当前位置-1
 * 如果当前位置大于n（即早右手）,则他下次出现的位置是 2*（当前位置 - n）
 * 个人建议在线面试题的时候如果5分钟内没想到好方法建议就使用暴力方法，
 * 毕竟测试用例不通过什么都没用

 */