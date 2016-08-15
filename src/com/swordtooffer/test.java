package com.swordtooffer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by carl on 2016/7/18.
 */
public class test {

//    public static void main(String args[]){
//
//
//        ArrayList<Integer> arrayList=new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//
//        System.out.println(arrayList.get(0));
//    }

    public static void main(String args[]){
        Object obj=new Object();

        Map<String,String> map=new HashMap<>();
        map.put(String.valueOf(System.currentTimeMillis())+"a","1");
        map.put(String.valueOf(System.currentTimeMillis())+"a","2");
        map.put(String.valueOf(System.currentTimeMillis())+"a","3");

        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey());
        }




    }

}

