package com.swordtooffer;

/**
 * Created by carl on 2016/8/15.
 */
public class SwordOffer48 {
    public int Add(int num1,int num2) {
        if(num2==0){return  num1;}
        if(num1==0){return num2;}
        int temp=num1^num2;
        int carry=num1&num2;
        return Add(temp,carry<<1);
    }

    public static void main(String[] args) {
        System.out.println(new SwordOffer48().Add(2,-100));
    }
}


/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号
 *
 *   看到的这个题目，我的第一反应是傻眼了，四则运算都不能用，那还能用什么啊？
 *
 *   可是问题总是要解决的，只能打开思路去思考各种可能性。
 *
 *   首先我们可以分析人们是如何做十进制的加法的，比如是如何得出5+17=22这个结果的。
 *
 *   实际上，我们可以分成三步的：
 *
 *   第一步只做各位相加不进位，此时相加的结果是12（个位数5和7相加不要进位是2，十位数0和1相加结果是1）；
 *
 *   第二步做进位，5+7中有进位，进位的值是10；
 *
 *   第三步把前面两个结果加起来，12+10的结果是22，刚好5+17=22。

 前面我们就在想，求两数之和四则运算都不能用，那还能用什么啊？对呀，还能用什么呢？

 对数字做运算，除了四则运算之外，也就只剩下位运算了。

 位运算是针对二进制的，我们也就以二进制再来分析一下前面的三步走策略对二进制是不是也管用。

 5的二进制是101，17的二进制10001。还是试着把计算分成三步：

 第一步各位相加但不计进位，得到的结果是10100（最后一位两个数都是1，相加的结果是二进制的10。这一步不计进位，因此结果仍然是0）；第二步记下进位。在这个例子中只在最后一位相加时产生一个进位，结果是二进制的10；第三步把前两步的结果相加，得到的结果是10110，正好是22。由此可见三步走的策略对二进制也是管用的。

 接下来我们试着把二进制上的加法用位运算来替代。第一步不考虑进位，对每一位相加。0加0与 1加1的结果都0，0加1与1加0的结果都是1。我们可以注意到，这和异或的结果是一样的。对异或而言，0和0、1和1异或的结果是0，而0和1、1和0的异或结果是1。接着考虑第二步进位，对0加0、0加1、1加0而言，都不会产生进位，只有1加1时，会向前产生一个进位。此时我们可以想象成是两个数先做位与运算，然后再向左移动一位。只有两个数都是1的时候，位与得到的结果是1，其余都是0。第三步把前两个步骤的结果相加。如果我们定义一个函数AddWithoutArithmetic，第三步就相当于输入前两步骤的结果来递归调用自己。

 */