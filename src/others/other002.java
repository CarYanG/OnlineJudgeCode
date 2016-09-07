package others;



/**
 * Created by carl on 2016/7/16.
 * 打印杨辉三角
 */
public class other002 {
    public void yanghui(int row){
        if(row<=0) System.out.println("");
        int a[]=new int[row];
        a[0]=1;  //每行第一个是1
        for(int i=0;i<row;i++){
            int m=i;
            while( m<row){
                System.out.print(" ");
                m++;
            }
            int temp=0;
            for(int j=0;j<=i;j++){
                a[j]=temp+a[j];
                temp=a[j]-temp;
                System.out.print(a[j]+" ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        new other002().yanghui(10);
    }


}
