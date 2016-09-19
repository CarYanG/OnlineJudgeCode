package others;

import java.util.Scanner;

/**
 * Created by carl on 2016/9/17.
 */
public class other514 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int tar=sc.nextInt();
            int length=sc.nextInt();
            int number[]=new int[length];
            for(int i=0;i<length;i++){
                number[i]=sc.nextInt();
            }

            System.out.println(function(number,tar));

        }
    }
    static int function(int number[],int tar){
        System.out.println("tar:"+tar);
        if(number.length==0) return -1;
        int low=0;int high=number.length-1;

        while (low<=high){
            int mid=(low+high)/2;
            if(number[mid]==tar){
                return mid;
            }

            else if(number[mid]<tar){
                low=++mid;


            }

            else if(number[mid]>tar){
                high=--mid;

            }

        }

        return -1-(low);

    }
}

/**
 * 题目描述：
 请写一个二分查找算法查找一个数最先出现的index，如果数不在集合中需要返回(-1)-当前数应该出现的位置。例如 [1,3,6],查找5,5应该是在index=2的位置但并不在集合中。返回(-1)-2 = -3。
 输入
 第一行读入一个整数x，表示要查找的数；第二行读入一个正整数n，表示待查找数组的元素个数；第三行读入n个递增整数，构成待查找的数组。
 输出
 整数x在数组中出现的索引位置(索引从0开始计数)；如果不存在，返回(-1)-当前数应该出现的位置。

 样例输入
 3
 5
 0 1 3 5 6
 样例输出
 2


 */