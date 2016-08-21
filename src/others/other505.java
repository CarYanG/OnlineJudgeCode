package others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/8/21.
 */
public class other505 {
    public int function(List<Integer> numberList){


        Collections.sort(numberList);
        System.out.println("wocai： "+numberList.size());
        if(numberList.size()==0){
            return 0;
        }
        else if(numberList.size()==1){
            return numberList.get(0)-1;
        }
        else
        {   int min=numberList.get(0)-1;
            for(int i=1;i<numberList.size();i++){
                min=min+numberList.get(i);

                if(!numberList.contains(min)){
                    return min;
                }


            }

            return min;
        }


    }



    public static void main(String args[]){


        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            Integer a=Integer.valueOf(in.nextLine().toString());
            String b=in.nextLine();

            String[] numbers=b.split(" ");
            List<Integer> numberList = new ArrayList<Integer>();
            for( String number : numbers){
                numberList.add(Integer.valueOf(number));
            }

            System.out.println(new other505().function(numberList));
        }

    }

}

/**
 * 数字游戏
 * 小易邀请你玩一个数字游戏，小易给你一系列的整数。你们俩使用这些整数玩游戏。
 * 每次小易会任意说一个数字出来，然后你需要从这一系列数字中选取一部分出来让它们的和等于小易所说的数字。
 * 例如： 如果{2,1,2,7}是你有的一系列数，小易说的数字是11.你可以得到方案2+2+7 = 11.
 * 如果顽皮的小易想坑你，他说的数字是6，那么你没有办法拼凑出和为6 现在小易给你n个数，让你找出无法从n个数中选取部分求和的数字中的最小数。
 输入描述:
 输入第一行为数字个数n (n ≤ 20)
 第二行为n个数xi (1 ≤ xi ≤ 100000)


 输出描述:
 输出最小不能由n个数选取求和组成的数

 输入例子:
 3
 5 1 2

 输出例子:
 4

 */
