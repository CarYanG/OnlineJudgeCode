package others;

/**
 * Created by carl on 2016/9/9.
 *
 * 幸运数47
 */
import java.util.Scanner;

public class other512 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (sc.hasNext()){
            int a=sc.nextInt();
            int number[]=new int[a];


            for(int i=0;i<a;i++){
                number[i]=sc.nextInt();

            }
            new other512().getLucky(number);

        }
    }



    void getLucky(int a[]){
        for(Integer number:a){

            int i,j,m;
            long n;

            for(i=1;;i++)
                if(number>2*(Math.pow(2,i-1)-1)&&number<=2*(Math.pow(2,i)-1)) break;

            for(j=i-1,m=number,n=0;j>=0;j--)
            { m-=Math.pow(2,j);
                if(m>Math.pow(2,j+1)-2)
                { n+=7*Math.pow(10,j);
                    m-=Math.pow(2,j); continue;}
                if(m<=Math.pow(2,j+1)-2)
                    n+=4*Math.pow(10,j);
            }
            System.out.println(n);

        }
    }
}


/**
 * 幸运数47的意思是只有4和7组成的数字，其序列顺序为4,7,44,47,74,77,444,447,474,..
 *
 * 求出第n个幸运数，n>1000000时也是测试用例
 */

