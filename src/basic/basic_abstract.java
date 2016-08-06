package basic;

/**
 * Created by carl on 2016/7/28.
 *
 * 抽象类在继承中的一些问题
 */
public class basic_abstract {
    public static void main(String arfs[]){
        absB test=new absB();
        System.out.println(test.a);
    }

}

abstract  class absA{

    protected  static int a=1;

    public absA(){
        System.out.println("abstract class father");
    }


}

class absB extends absA{

}