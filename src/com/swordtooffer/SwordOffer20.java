package com.swordtooffer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carl on 2016/8/11.
 */
public class SwordOffer20 {
    private int size;
    private List<Integer> objects ;

    public SwordOffer20(){
        this.size=0;
        this.objects=new ArrayList<>();
    }

    public void push(int node) {
        objects.add(node);
        size++;

    }

    public void pop() {
        if(size==0){
            System.out.println("error");
        }
        else
        {
            objects.remove(--size);
        }


    }

    public int top() {
        if(size==0){
            return 0;
        }
        else
        {
            return objects.get(size-1);
        }

    }

    public int min() {
        //复杂度不是o(1)
        int min=Integer.MAX_VALUE;
        for(Integer a:objects){
            if (a<min){min=a;}
        }

        return min==Integer.MAX_VALUE? 0:min;
    }
}

/*
实现一个栈，能够得到栈最小元素的min函数，要求复杂度为O（1）
 */