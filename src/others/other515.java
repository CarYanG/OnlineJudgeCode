package others;

import java.util.Scanner;

/**
 * Created by carl on 2016/9/17.
 */
public class other515 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int countryNumber=sc.nextInt();
            int number[]=new int[countryNumber*countryNumber];
            for(int i=0;i<countryNumber*countryNumber;i++){
              number[i]=sc.nextInt();

            }


            function(number,countryNumber);
        }
    }

    static void function(int []number,int countryNumber){
        int min=Integer.MIN_VALUE;
        for(int i=0;i<countryNumber;i++){
            for(int j=0;j<countryNumber;j++){

            }
        }


    }

}
/**
 * 暴风降临的龙母丹妮莉丝·坦格利安要骑着她的龙以最快的速度游历各国，她的谋士们纷纷献策规划路线。作为她的谋士之一和仰慕者的你，
 * 决定冒险穿越到21世纪借助计算机来寻求最优路线。请设计一段程序，读取各国两两之间的距离，距离以邻接矩阵表示，并计算出遍历各国的最短路径长度。
 输入
 第一行：国家数量，假设为n
 后续n行是国家间距离的邻接矩阵表示
 输出
 遍历各国的最短路径长度

 样例输入
 4
 0,1,2,3
 1,0,4,5
 2,4,0,2
 3,5,2,0

 样例输出
 5

 */
