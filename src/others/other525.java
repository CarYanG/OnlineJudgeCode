
package others;

import java.util.Scanner;

/**
 * Created by carl on 2016/10/2.
 *
 * Wireless Routers
 */
public class other525 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){

            int roomnumber=sc.nextInt();
            int routernumber=sc.nextInt();

            int i=0;

            int weight[]=new int[roomnumber];
            while(i<roomnumber){

                weight[i]=sc.nextInt();
                i++;
            }

            //构造矩阵
            int martrix[][]=new int[roomnumber][roomnumber];
            while(i-1>0){
                int m=sc.nextInt()-1;
                int n=sc.nextInt()-1;
                martrix[m][n]=weight[n];
                martrix[n][m]=weight[m];
                martrix[i-1][i-1]=weight[i-1];
                i--;
            }
            martrix[i-1][i-1]=weight[i-1];

            foo(martrix,routernumber);


        }
    }

    static  void foo(int [][]martrix,int routernumber){

//        for(int i=0;i<martrix.length;i++){
//            for(int j=0;j<martrix[i].length;j++){
//
//                System.out.print(martrix[i][j]+ " ");
//
//            }
//            System.out.println();
//        }
//
//        System.out.println("routernumber:"+routernumber);

        int sum=0;
        int current=0;
        while(current<routernumber){

            int rowIndex=0;
            int max=0;

            //最多的行
            for(int i=0;i<martrix.length;i++){

                int j=0;
                int tempSum=0;
                while(j<martrix[i].length){

                    tempSum=martrix[i][j]+tempSum;
                    j++;
                }
                if(tempSum>max){
                    rowIndex=i;
                    max=tempSum;
                }


            }

            //处理
            for(int i=0;i<martrix[rowIndex].length;i++){
                if(martrix[rowIndex][i]>0){
                    int row=0;
                    while(row<martrix[0].length){
                        martrix[row][i]=0;
                        row++;
                    }



                }

            }

            sum=sum+max;
            current++;

        }

        System.out.println(sum);

    }
}

/**
 * Wireless Routers
 Description

 Alice just bought a very big house with N rooms and N-1 doors, which each door connects two rooms.

 Besides, each room have at least one door and at most 3 doors(of course Alice can go to every room in this house).

 However, a modern person cannot live without Wifi, so Alice wants to put M wireless routers in several rooms.

 As the routers are cheap, only adjacent rooms (which have a door connect to this room) can receive it, and each router works independently.

 Since M routers may cannot cover every room, Alice tells you the satisfaction point S[i] she could have if room i have Wifi.

 Please help Alice to calculate the maximum satisfaction point she can get in total.

 Input

 The first line is two integers N(2 <= N <= 1000), M(1 <= M <= N, M <= 100) Then are N lines, each shows the satisfaction S[i](1 <= S[i] <= 10) point of room i. Then are N - 1 lines, each contains two integers x, y, which represents a door is between room x and y.

 Output

 Just output the maximum point of satisfaction.

 Limits

 Memory limit per test: 256 megabytes
 Time limit per test: The faster the better
 Compile & Environment

 C++

 g++ Main.cc -o Main -fno-asm -Wall -lm --static -std=c++0x -DONLINE_JUDGE
 Java

 J2SE 8

 Maximum stack size is 50m

 Sample Test
 input
 5 1
 1 2 3 4 5
 2 1
 3 2
 4 2
 5 3
 output
 10

 */