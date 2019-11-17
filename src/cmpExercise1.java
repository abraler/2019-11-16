public class cmpExercise1 {
    public static void Find(){
        int j=0;
        for (int i = 0; i <10000 ; i++) {
            j+=i;
        }
        System.out.println(j);
    }
    public static void Find1(){
        int j=0;
        for (int i = 0; i <10000 ; i+=2) {
            j+=i;
        }
        System.out.println(j);
    }
    public static void Find2(){
        int j=0;
        for (int i = 0; i <10000 ; i++) {
            j+=i*2;
        }
        System.out.println(j);
    }
    public static void main(String[] args) {
        long begin=System.nanoTime();
        Find();
        Find1();
        Find2();
        long end=System.nanoTime();
        System.out.println(end-begin);
    }
}
