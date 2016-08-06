package basic;

/**
 * Created by carl on 2016/8/3.
 *
 * 关于静态代码块与构造代码块，普通代码块
 */
public class basic_codeblock {
    static int x=100;


    static {
        x=98;
    }

    {
        x=99;
    }


    public static void main(String args[]){
        System.out.println("x="+x);   //x=100

        new basic_codeblock();  //每new一次就执行一次构造代码块

        System.out.println("x="+x);   //x=99




    }
}
