package basic;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by carl on 2016/8/11.
 *
 * 测试arraylist的是头插还是尾插,看来是尾插
 *
 *
 */
public class basic_arrayList {

    public static  void main(String args[]){
        List<Integer> test=new ArrayList<Integer>();
        test.add(1);
        test.add(2);
        test.add(3);

        for(Integer a:test){
            System.out.println(a);
        }

        System.out.println(test.get(0));


    }
}
