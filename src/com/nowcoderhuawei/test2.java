package com.nowcoderhuawei;

/**
 * Created by carl on 2016/4/27.
 */

class Base{
    private int age;
    String name;
    public void setName(String s){
        this.name=s;
    }
}
public class test2 extends Base {
    public void setName2(String s){
        name=s+"  test2";

    }

    public static void main(String args[]){
        Base b=new test2();
        b.setName("yang");

        System.out.println(b.name);

    }
}


