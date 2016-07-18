package others;

/**
 * Created by carl on 2016/7/16.
 *
 * 求两个数的最大公约数
 */
public class zuidagongyueshu {

    public static void main(String args[]){
        System.out.println(new zuidagongyueshu().solution(24,20));

        System.out.println( zuidagongyueshu.gcd(24,26));
    }

    public int solution(int a,int b){

        int result = a>=b? a%b:b%a;

        if(result==0){
            return a>=b? b:a;
        }

        else{
            return solution(a>=b? b:a,result);
        }

    }

    public static int gcd(int m, int n) {

        while (true) {
            if ((m = m % n) == 0)
                return n;
            if ((n = n % m) == 0)
                return m;
        }
    }
}
