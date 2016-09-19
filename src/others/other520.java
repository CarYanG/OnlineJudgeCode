package others;

import java.util.Scanner;

/**
 * Created by carl on 2016/9/18.
 */
public class other520 {

    static int mark[][];   //用于记录走过的点
    static int dir[][] = {{ 1,0 },{ 0,1 },{ -1,0 },{ 0,-1 }};  //右下左上四个方向

    static int matrix[][];

    static StringBuilder path=new StringBuilder("[0,0],");

    static String minPath="";

    static  int minStrength=Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int n = in.nextInt();
            int m = in.nextInt();
            int p=  in.nextInt();
            matrix =new int[n][m];

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    matrix[i][j]=in.nextInt();

                }
            }

            mark=new int[n][m];

            new other520().function(0,0,p);

            if(minPath.length()==0){
                System.out.println("Can not escape!");
            }
            else{
                System.out.println(minPath.substring(0,minPath.length()-1));
            }
        }

    }

      int   function(int x,int y,int p){
          System.out.println("p="+p);
        int n=matrix.length;
        int m=matrix[0].length;

        int i;
        int tx, ty;

        if (x == 0 && y == m-1) {
            if(p>minStrength){
                minPath=path.toString();
                minStrength=p;

            }

//            if(result.length()==0){
//                System.out.println("Can not escape!");
//            }
//            else
//            {
//                System.out.println(result.substring(0,result.length()-1));
//            }

            return 0;
        }

        if(p<=0){
            return 0;
        }


        for (i = 0; i < n; i++) {
            tx = x + dir[i][0];
            ty = y + dir[i][1];
            if (tx < 0 || tx > n-1 || ty < 0 || ty > m-1)
                continue;
            if (matrix[tx][ty] == 1 && mark[tx][ty] == 0) {

                mark[tx][ty] = 1;   //标记已到过此点

                path.append("["+tx+","+ty+"],");

                if(tx-x==0){
                    p=p-1 ; // 平移减1
                }

                else if(tx-x==-1){

                    p=p-3 ; //上移减3
                }

                function(tx, ty,p);//进行下一步尝试

                mark[tx][ty] = 0;//尝试结束，取消对此点标记

            }
        }
        return  0;


    }
}

/**
 *小青蛙有一天不小心落入了底下迷宫，小青蛙希望自己用仅剩的体力值P跳出这个地下迷宫，为了额昂问题简单
 * 假设这是一个n*m的地下迷宫，每个位置用0或者1表示，0代表阻碍物无法到达，1代表小青蛙可以到达的位置
 * 小青蛙初始在（0,0）这个位置，出口在（0，m-1）的位置，（保证这两个位置都是1，并且保证一定有
 * 起点到终点可达的路径）小青蛙在迷宫中水平移动一个单位消耗1点体力值，向上爬一个单位消耗3个单位的体力值，
 * 向下移动则不消耗体力值，当小青蛙的体力值为0的时候，若还没到达出口，小青蛙将无法逃离。
 *
 * 现在需要你帮助小青蛙计算出能否用仅剩的体力值跳出迷宫。即到达（0，m-1）的位置
 *
 * 输入描述
 *
 * n+1行输入
 *
 * 第一行为3个整数 n，m p
 *
 * 接下来n行表示迷宫
 *
 * 每行有m个0或者1
 *
 * 输出描述：
 * 若能逃离了迷宫，则输出一行体力消耗最小的路径，输出格式见样例所示：
 * 如果不能逃离迷宫，则输出“can not escape”
 *
 * 测试数据保证答案唯一
 *
 * 输入例子
 * 4 4 10
 * 1 0 0 1
 * 1 1 0 1
 * 0 1 1 1
 * 0 0 1 1
 *
 * 输出例子
 * [0,0],[1,0],[1,1],[2,1],[2,2],[2,3],[1,3],[0,3]
 *
 *
 *
 *
 *

 */
