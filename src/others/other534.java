package others;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by carl on 2016/12/17.
 *
 * 相邻数对
 */
public class other534 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int total =Integer.valueOf(scanner.nextLine());
            LinkedList<Integer> numberList=new LinkedList<>();
            int target=0;
            while(total>0){
                int temp=scanner.nextInt();
                numberList.add(temp);
                total--;
            }
            Collections.sort(numberList);
            for(int i=0;i<numberList.size()-1;i++){
                if(numberList.get(i)-numberList.get(i+1)==1 || numberList.get(i)-numberList.get(i+1)==-1){
                    target++;
                }
            }
            System.out.println(target);
        }
    }

}


/**
 * 问题描述
 　　给定n个不同的整数，问这些数中有多少对整数，它们的值正好相差1。
 输入格式
 　　输入的第一行包含一个整数n，表示给定整数的个数。
 　　第二行包含所给定的n个整数。
 输出格式
 　　输出一个整数，表示值正好相差1的数对的个数。
 样例输入
 6
 10 2 6 3 7 8
 样例输出
 3
 样例说明
 　　值正好相差1的数对包括(2, 3), (6, 7), (7, 8)。
 评测用例规模与约定
 　　1<=n<=1000，给定的整数为不超过10000的非负整数。

 */