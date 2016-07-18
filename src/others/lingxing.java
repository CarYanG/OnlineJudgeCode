package others;

/**
 * Created by carl on 2016/7/16.
 *
 *
 * 打印一个菱形
 */
public class lingxing {
    public static void main(String args[]){
        for(int i=0;i<5;i++){

            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println("");

        }

        for(int i=4;i>0;i--){

            for(int j=0;j<4-i+2;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i-1;k++){
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
