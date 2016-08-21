package others;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/8/21.
 * 藏宝图
 */
public class other504 {
    public void function(String a,String b){
        ArrayList<Character> aSet=new ArrayList<Character>();

        char aa[]=a.toCharArray();
        for(int i=0;i<aa.length;i++){
            aSet.add(aa[i]);
        }

        if(b.equals("")){
            System.out.println("Yes");
        }
        else {
            boolean flag=true;
            aa=b.toCharArray();
            for(int i=0;i<aa.length;i++){
                if(!aSet.contains(aa[i])){
                    System.out.println("No");
                    flag=false;
                    break;
                }
                else {

                    aSet.remove(Character.valueOf(aa[i]));


                }
            }


            if(flag){System.out.println("Yes");}
        }



    }
    public static void main(String args[])

    {
//        Scanner in=new Scanner(System.in);
//        while (in.hasNext()){
//            String a=in.nextLine();
//            String b=in.nextLine();
//            new other504().function(a,b);
//        }

        new other504().function("oxoxoxox","ooxxoo");
//        new other504().function("abc","aaa");

    }
}
/**
 * 牛牛拿到了一个藏宝图，顺着藏宝图的指示，牛牛发现了一个藏宝盒，藏宝盒上有一个机关，
 * 机关每次会显示两个字符串 s 和 t，根据古老的传说，
 * 牛牛需要每次都回答 t 是否是 s 的子序列。
 * 注意，子序列不要求在原字符串中是连续的，
 * 例如串 abc，它的子序列就有 {空串, a, b, c, ab, ac, bc, abc} 8 种。
 输入描述:
 每个输入包含一个测试用例。每个测试用例包含两行长度不超过 10 的不包含空格的可见 ASCII 字符串。


 输出描述:
 输出一行 “Yes” 或者 “No” 表示结果。

 输入例子:
 x.nowcoder.com
 ooo

 输出例子:
 Yes

 */
