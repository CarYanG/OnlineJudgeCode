package basic;

/**
 * Created by carl on 2016/7/23.
 *
 *
 * 构造函数的顺序
 *
 * 构造函数与静态代码块的顺序，与非静态代码块的顺序    静态代码块-》父类构造函数—》成员变量中引用的其他对象构造函数-》构造代码块-》自己的构造函数
 *
 */
public class basic_extends extends  A{

    C c=new C();

    public basic_extends(){
        System.out.println("B without para");
    }
    public basic_extends(int i){
        super(i);
        System.out.println("B with para:"+i);
    }

    {
        System.out.println("non static :son");
    }
    static {
        System.out.println("static:son");
    }

    public static void main(String args[]){
         basic_extends b=new basic_extends(110);
//        System.out.println(a.getClass());
    }
}

class A{

    public A(){
        System.out.println("A without para");
    }

    public A(int i){
        System.out.println("A with para:"+i);
    }

    {
        System.out.println("non static :father");
    }
    static {
        System.out.println("static:father");
    }
}

class C{
    public void C(){
        System.out.println(" not C constructor");
    }

    public C(){
        System.out.println("C");
    }
}
