package com.nowcoderhuawei;

/**
 * Created by carl on 2016/4/15.
 */
public class test {
    private   int a=0;
    public test(){
        System.out.println(this.a);
    }
    public void function(){
        System.out.println(a+"A");
    }
    public static void main(String args[]){
         int a=1;
        System.out.println(a);
        new test().function();;


    }
}
