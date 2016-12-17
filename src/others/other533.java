package others;



import java.util.*;

/**
 * Created by carl on 2016/12/17.
 *
 * 出现次数最多的数
 */
public class other533 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while (sc.hasNext()){
            int total =Integer.valueOf(sc.nextLine());
            HashMap<Integer,Integer> countHashMap=new HashMap<>();
            int maxFrequency=0;
            int target=Integer.MAX_VALUE;
            while (total>0){
                int temp=sc.nextInt();
                if(countHashMap.containsKey(temp)){

                    int lastFrequency=countHashMap.get(temp);
                    countHashMap.put(temp,lastFrequency+1);

                    if(maxFrequency==lastFrequency+1) {
                        if(target>temp){
                            target=temp;
                        }
                    }
                    else if(maxFrequency<lastFrequency+1){
                        maxFrequency=lastFrequency+1;
                        target=temp;
                    }

                }
                else{

                    countHashMap.put(temp,1);
                    if(maxFrequency==1) {
                        if(target>temp){
                            target=temp;
                        }
                    }
                    else if(maxFrequency<1){
                        maxFrequency=1;
                        target=temp;
                    }
                }
                total--;

            }
            System.out.println(target);


        }
    }
}


/**
 *
 * 问题描述
 　　给定n个正整数，找出它们中出现次数最多的数。如果这样的数有多个，请输出其中最小的一个。

 输入格式
 　　输入的第一行只有一个正整数n(1 ≤ n ≤ 1000)，表示数字的个数。
 　　输入的第二行有n个整数s1, s2, …, sn (1 ≤ si ≤ 10000, 1 ≤ i ≤ n)。相邻的数用空格分隔。
 输出格式
 　　输出这n个次数中出现次数最多的数。如果这样的数有多个，输出其中最小的一个。
 样例输入
 6
 10 1 10 20 30 20
 样例输出
 10

 */