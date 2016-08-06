package basic;

/**
 * Created by carl on 2016/7/28.
 *  父类和子类的实例对象，调用函数问题 涉及向上造型问题
 *
 *  构造函数能否为private,可以,在单例模式中使用
 *
 *  静态变量和静态方法在继承中的问题,同一内存块
 *
 */

class D{
    protected D(){
        System.out.println("D");
    }

    public void printsth(){
        System.out.println("the class D");
    }
    public void printfather(){
        System.out.println("father: the class D");
    }
    public static int a=1;
    public static void staticprint(){
        System.out.println("D the staticprint:" +a);
    }
}

class E extends D{
    public E(){
        System.out.println("E");
    }
    public void printsth(){
        System.out.println("the class E");
    }

    public void printson(){
        System.out.println("son: the class E");
    }


    public static void staticprint(){
        a++;
        System.out.println("E the staticprint:" +a);
    }
}

class DD{
    private DD(){
        System.out.println("DD");
    }

    public DD(int a){
        this();
        System.out.println("the second function with para");
    }
}
public class basic_extends_2 {
    public static void main(String args[]){

        D d=new E();  //首先调用父类的构造函数，其次调用子类的构造函数

        d.printsth();  // 父类和子类都有的方法，而且子类覆盖了父类的方法，此时调用子类的方法

        d.printfather();  // 父类和子类都有的方法，子类并没有覆盖父类的方法，此时调用的是父类中代码段。

        ((E)d).printson();  //父类没有，但是子类扩展的方法，此时若想调用，需要做类型转化，不能直接调用




        System.out.println("*************");

        E e=new E();
        e.printsth();
        e.printfather();
        e.printson();

        System.out.println("&&&&&&&&&&&&&&");

//      构造函数为private
        DD dd=new DD(2);

//      DD dd2=new DD();


        System.out.println("#################");

        //测试静态方法和变量在继承中
        D.staticprint();
        System.out.println(D.a);

        E.staticprint();
        System.out.println(E.a);

        D.staticprint();
        System.out.println(D.a);

    }

}
