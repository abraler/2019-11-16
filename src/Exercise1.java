import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Exercise1 {
    public static class Find1 extends Thread{
        @Override
        public void run() {
            int j=0;
            for (int i = 0; i <10000 ; i++) {
                j+=i;
                System.out.println("111111111111111111");
            }
            System.out.println(j);
        }
    }
    public static class Find2 extends Thread{
        @Override
        public void run() {
            int j=0;
            for (int i = 0; i <10000 ; i+=2) {
                j+=i;
                System.out.println("222222222222222222");
            }
            System.out.println(j);
        }
    }
    public static class Find3 implements Runnable{
        @Override
        public void run() {
            int j=0;
            for (int i = 0; i <10000 ; i++) {
                j+=i*2;
                System.out.println("33333333333333333333");
            }
            System.out.println(j);
        }

    }
    public static void main(String[] args) {
        Thread f1=new Find1();
        Thread f2=new Find2();
        Thread f3=new Thread(new Find3());
        long begin=System.nanoTime();
        f1.start();
        f2.start();
        f3.start();
        long end=System.nanoTime();
        System.out.println(end-begin);
    }
}
