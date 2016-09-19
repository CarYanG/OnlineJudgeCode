package others;

import java.util.Scanner;

/**
 * Created by carl on 2016/9/18.
 */
public class other519 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int a = in.nextInt();
            System.out.println(function(a));
        }
    }

    static int function(int a){
        int count=0;

        while(a>4){   //5！才开始末尾有0

            a=a/5;
            count+=a;

        }

     return count;

    }
}

/**
 * 输入一个正整数n，求n！末尾有几个0
 *
 * 输入10，n!=3628800
 *
 * 输出为2

 */