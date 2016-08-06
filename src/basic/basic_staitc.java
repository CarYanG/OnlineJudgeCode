package basic;

/**
 * Created by carl on 2016/8/3.
 *
 *
 * 静态成员变量能否在构造函数内初始化
 *
 * 静态代码块的运行
 *
 *
 * 静态方法(静态代码块)，比如main方法不能调用非静态成员变量
 *
 * 静态代码块一加载即运行了，静态方法需要调用运行
 */
public class basic_staitc {
    int x;
    private static int y;
    static{

        System.out.println("this is a static code block");
//        x=1;    不能调用非静态成员变量

        System.out.println("y="+y);  //默认值为0
        y=1;

        int z=10;   //这个z没有意义吗
    }



    static int z;

    public static void method(){
        z=100;
    }

    {
        z=-100;
    }

    public static void main(String args[]){

//        y=2;

        z--;

        System.out.println("y=" +y);
        System.out.println("z="+z);
//        System.out.println("z="+z);
//        method();
//        System.out.println("z="+z);

        System.out.println("&&&&&&&&&&&&&&&&");
//        System.out.println(new basic_staitc().x);  //默认值为0
        new basic_staitc();      //此时构造代码块加载，z=-100
        System.out.println("z="+z);

    }

}
