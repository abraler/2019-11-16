import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StopThread {
    private static class Worker extends Thread{
        private volatile boolean p=false;
        public void setQuit(boolean p){
            this.p=p;
        }
        Worker(){
            super("李四");
        }
        @Override
        public void run() {
            while (!p) {
                System.out.println(this.getName() + "正在转账");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(this.getName()+"对方是骗子，我不转账了");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Worker worker=new Worker();
        worker.start();
        System.out.println("我是张三，正在等李四转账");
        Thread.sleep(1000*10);
        System.out.println("通知李四对方是骗子");
        worker.setQuit(true);
        System.out.println("通知李四完毕");
        worker.join();
        System.out.println("李四停止转账");
    }


}
