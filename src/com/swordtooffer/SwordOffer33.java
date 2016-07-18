package com.swordtooffer;

/**
 * Created by carl on 2016/7/18.
 *
 * 丑数
 */
public class SwordOffer33 {
    public static void main(String gs[]){

        System.out.println(new SwordOffer33().GetUglyNumber_Solution(1500));


    }

    public int GetUglyNumber_Solution(int index) {


        if(index==0)return 0;
        else
        {
            int uglyarray[]=new int[index];
            uglyarray[0]=1;


            for(int i=1;i<index;i++){
                int min2=0;
                int min3=0;
                int min5=0;
                int temp=0;
                for(int j=0;j<i;j++){

                    temp=2*uglyarray[j];

                    if(temp>uglyarray[i-1]){
                        min2=temp;
                        break;
                    }

                }

                for(int j=0;j<i;j++){

                    temp=3*uglyarray[j];

                    if(temp>uglyarray[i-1]){
                        min3=temp;
                        break;
                    }

                }

                for(int j=0;j<i;j++){

                    temp=5*uglyarray[j];

                    if(temp>uglyarray[i-1]){
                        min5=temp;
                        break;
                    }

                }

                if(min2<=min3&&min2<=min5){
                    uglyarray[i]=min2;
                }

                if(min3<=min2&&min3<=min5){
                    uglyarray[i]=min3;
                }

                if(min5<=min3&&min5<=min2){
                    uglyarray[i]=min5;
                }


            }


            return uglyarray[index-1];
        }

    }

}


/**
 题目描述

 把只包含因子2、3和5的数称作丑数（Ugly Number）。
 例如6、8都是丑数，但14不是，因为它包含因子7。
 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */

/*
     赶紧来试一试。不过假设给了我们从1开始的10个丑数，怎么找出第11个呐？等等，诶，丑数不是只由2，3，5构成的嘛，

     而且我们拿到的数也是由2，3，5构成的，而且是最小的10个，那么第11个一定就比前十个数中的某一个多一个因子2，或者因子3，

     或者因子5……也就是说，第11个丑数一定是前十个丑数中某一个丑数的2倍，或者3倍，或者5倍！！

        这个很关键，再仔细想一想噢。现在知道了 第11个丑数一定是前十个丑数中某一个丑数的2倍，或者3倍，或者5倍，还是不行呢，

        那到底是2倍还是3倍还是5倍呢o(︶︿︶)o。。。

        想起来啦，我们的第十一个丑数一定是，大于第十个丑数的所有丑数中，最小的！！！

        那就是说，我们可以在第一到第十个丑数中找出某个丑数 a ，

        它的两倍刚好大于第十个丑数（刚好的意思就是，上一个数的两倍还小于第十个丑数，而它自己的两倍却大于第十个丑数了）；

        然后再找出前十个丑数中的三倍刚好大于第十个丑数的家伙 b ；最后找出前十丑数中某丑数5倍刚好大于第十个丑数的丑数 c ~~~2*a，3*b，5*c，

        找出这三个中最小的就行啦(*^__^*)
 */