package others;

/**
 * Created by carl on 2016/10/29.
 * 贪吃的小明
 */

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by carl on 2016/10/17.
 */
public class other528 {
    static HashMap<String,Integer> translate=new HashMap<>();
    public static void main(String[] args) {

        translate.put("ONE",1);
        translate.put("TWO",2);
        translate.put("THREE",3);
        translate.put("FOUR",4);
        translate.put("FIVE",5);
        translate.put("SIX",6);
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){

            int number=Integer.valueOf(sc.nextLine());
            String[] dianshu=new String[number];
            int i=0;
            while(i<number){

                dianshu[i++]=sc.nextLine();


            }
            function(dianshu,number);




        }
    }
    static void function(String  dianshu[],int number){
        int even=0;
        int xiaomingWin=0;
        for(int i=0;i<dianshu.length;i++){

            String[] temp=dianshu[i].split(" ");

            if(translate.get(temp[0])>translate.get(temp[1])){

                xiaomingWin++;

            }

            else if(translate.get(temp[0])==translate.get(temp[1])){

                even++;

            }


        }

        int xiaoliangWin=number-even-xiaomingWin;
        System.out.println(xiaomingWin+" "+xiaoliangWin+" "+even);
        if(xiaoliangWin>=xiaomingWin){
            System.out.println("LiangLiang Win");
        }
        else {
            System.out.println("MingMing Win");
        }

    }
}

/**
 *
 *
 *   小明特别喜欢吃巧克力，所以家里人每天都会给他一块巧克力吃。今天小明的朋友小亮来到小明家里做客，由于事先并不知道小亮回来所以小明的家里人只给他准备了一块巧克力。
 *
 *   为了避免尴尬，聪明的小明对小亮说我们掷筛子吧，掷赢的有巧克力吃。他们首先说好要掷n次，如果小明掷的点数大于小亮掷的点数的次数大于小亮掷的点数大于小明的次数那么巧克力归小明，反之巧克力归小亮，特别的当两个人获胜的次数相同时，出于礼貌小明会把巧克力让给小亮。

 由于掷的次数特别多，所以他们的想请你来帮他们统计一下结果。对了，由于他们最近在学英语，所以每个人每次掷的结果是使用英文单词ONE， TWO，THREE，FOUR，FIVE，SIX来记录的。

 输入
 第一行一个整数n（1 <= n <= 100000）表示每个人掷筛子次数
 接下来n行每行两个单词，依次表示小明和小亮的点数
 输出
 输出共两行。
 第一行为三个整数：
 分别为小明获胜次数， 小亮获胜次数，平局次数
 第二行输出谁获得巧克力：
 如果小亮获得巧克力输出 “LiangLiang Win” ，否则输出‘MingMing Win’

 样例输入
 3
 ONE SIX
 SIX FIVE
 TWO TWO
 样例输出
 1 1 1
 LiangLiang Win

 */
