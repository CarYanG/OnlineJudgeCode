package basic;

/**
 * Created by carl on 2016/8/1.
 * String 的一些特点
 *
 */
public class basic_string {

    public static void main(String argsp[]){

        String a="123";
        String b="456";

        String c="123456";
        String d="123"+b;
        String e="123"+"456";


        System.out.println(c==d);  //false
        System.out.println(c==e);  //true


        String i="";
        if(i==i+0){
            System.out.println("Hello world");
        }










    }
}
