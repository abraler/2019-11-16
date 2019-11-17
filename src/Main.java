import java.util.ArrayList;
public class Main {
    public static int[] multiply(int[] A) {
        int[] b=new int [A.length];
        for (int i = 0; i <b.length ; i++) {
            b[i]=1;
        }
        for(int i=1;i<b.length;i++){
            b[i]=b[i-1]*A[i-1];
        }
        int p=1;
        for(int i=b.length-1;i>0;i--){
            p*=A[i];
            b[i-1]=p*b[i-1];
        }

        return b;
    }

    public static void main(String[] args) {
        int []a={1,2,3,4};
        int []b=multiply(a);
        for (int i = 0; i <b.length ; i++) {
            System.out.println(b[i]);
        }
    }
}