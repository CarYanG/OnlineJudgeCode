package basic;

/**
 * Created by carl on 2016/9/6.
 *
 * 关于静态代码块，和非静态代码。
 */
public class basic_codeblock2 {

    public static basic_codeblock2 test=new basic_codeblock2();

    {
        System.out.println("Block B");
    }
    static {
        System.out.println("Block A");
    }

    public static void main(String[] args) {
        basic_codeblock2 temp= new basic_codeblock2();
    }
}
