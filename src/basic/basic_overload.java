package basic;

/**
 * Created by carl on 2016/7/28.
 *
 * 函数重载中的一些问题
 *
 * 参数的顺序不同，可以
 *
 * 参数的数量不同，可以
 *
 * 参数的类型不同，可以
 *
 * 返回值不用，不可以
 *
 * 修饰符不同，不可以
 *
 */
public class basic_overload {

    public void function(){
        System.out.println("public void function()");
    }
    public void function(int a){
        System.out.println(" public void function(int a)");
    }

    public void function(int a,String b){
        System.out.println(" public void function(int a,String b)");
    }

    public  void function(String b ,int a){
        System.out.println("  private void function(String b ,int a)");
    }

//    private  int  function(String b ,int a){
//        System.out.println("  private void function(String b ,int a)");
//        return 0;
//    }



    public static void main(String args[]){
        basic_overload test=new basic_overload();

        test.function("ss",2);

    }
}
