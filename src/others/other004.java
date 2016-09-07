package others;

/**
 * Created by carl on 2016/9/7.
 *最小公倍数=两整数的乘积÷最大公约数
 */
import  java.util.Scanner;
public class other004 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (sc.hasNext()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int gcdnumber=new other004().gcd(a,b);
            System.out.println(a*b/gcdnumber);
        }


    }

    int gcd(int a,int b){
        //求最大公约数
        if(a%b==0) return b;
        if(b%a==0) return a;
        return  a>b? gcd(b,a%b):gcd(a,b%a);
    }


}
